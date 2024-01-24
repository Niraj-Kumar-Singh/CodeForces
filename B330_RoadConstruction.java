import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class B330_RoadConstruction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        int k=0, v=0;
        for(int i=0;i<m;i++)
        {
            k=sc.nextInt();
            v=sc.nextInt();
            if(hm.containsKey(k))
            {
                ArrayList<Integer> list = hm.get(v);
                list.add(v);
                hm.put(v, list);
            }
            else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(v);
                hm.put(k, list);
            }
        }

        ArrayList<Integer[]> ans = new ArrayList<>();


        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                    continue;

                boolean isJPresent = false;
                if(hm.containsKey(i))
                {
                    ArrayList<Integer> list = hm.get(i);
                    for(int idx=0; idx<list.size();idx++)
                    {
                        if(list.get(idx)==j)
                        {
                            isJPresent=true;
                            break;
                        }
                    }
                }
                else if(hm.containsKey(j))
                {
                    ArrayList<Integer> list = hm.get(i);
                    for(int idx=0; idx<list.size();idx++)
                    {
                        if(list.get(idx)==i)
                        {
                            isJPresent=true;
                            break;
                        }
                    }
                }







                if(!isJPresent)
                    ans.add(new Integer[]{i, j});

            }
        }
    }
  
}

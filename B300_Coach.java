import java.util.*;

public class B300_Coach
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][]=new int[m][2];

        for(int i=0;i<m;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        boolean isPossible = true;
        for(int i=0;i<m;i++)
        {
            int a = arr[i][0];
            int b = arr[i][1];

            if(hm.containsKey(a))
            {
                if(hm.get(a).size()==3)
                {
                    isPossible=false;
                    break;
                }

                ArrayList<Integer> list = hm.get(a);
                list.add(b);
                if(!addElements(hm, a, b))
                {
                    isPossible=false;
                    break;
                }
            }
            else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(b);
                hm.put(a, list);

                if(hm.containsKey(b))
                {
                    if(hm.get(b).size()==3)
                    {
                        isPossible=false;
                        break;
                    }
                    else
                    {
//                        ArrayList<Integer> l = hm.get(b);
//                        l.add(a);
//                        hm.put(b, l);
                        if(!addElements(hm,b,a))
                        {
                            isPossible=false;
                            break;
                        }
                    }

                }
                else
                {
                    hm.put(b, list);
                }
            }
        }


        if(isPossible)
        {
            HashSet<ArrayList<Integer>> hs = new HashSet<>();
            for(Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet())
            {
                hs.add(entry.getValue());
            }

            for(ArrayList<Integer> ls : hs)
            {
                System.out.println(ls);
            }
        }
        else
            System.out.println(-1);

    }

    public static boolean addElements(HashMap<Integer, ArrayList<Integer>> hm,int key, int x)
    {
        ArrayList<Integer> list = hm.get(key);
        list.add(x);

        for(int y : list)
        {
            ArrayList<Integer> temp = hm.get(y);
            temp.add(x);
            if(temp.size()>3)
                return false;
            hm.put(y, temp);
        }

        return true;
    }
  
}

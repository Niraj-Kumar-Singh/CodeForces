import java.util.HashMap;
import java.util.Scanner;

public class B357_FlagDay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<m;i++)
        {
            int color=1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(hm.containsKey(a))
            {
                int val = hm.get(a);
                int k = 1;
                if(val==k)
                    k++;
                hm.put(b, k);
                k++;
                if(val==k)
                    k++;
                hm.put(c, k);
            }
            else if(hm.containsKey(b))
            {
                int val = hm.get(b);
                int k = 1;
                if(val==k)
                    k++;
                hm.put(a, k);
                k++;
                if(val==k)
                    k++;
                hm.put(c, k);
            }
            else if(hm.containsKey(c))
            {
                int val = hm.get(c);
                int k = 1;
                if(val==k)
                    k++;
                hm.put(b, k);
                k++;
                if(val==k)
                    k++;
                hm.put(a, k);
            }
            else
            {
                hm.put(a, 1);
                hm.put(b, 2);
                hm.put(c, 3);
            }
        }

        for(int i=1;i<=n;i++)
        {
            System.out.println(hm.get(i));
        }
    }
  
}

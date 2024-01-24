import java.util.HashMap;
import java.util.Scanner;

public class B459_PashmakAndFlowers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            min=Math.min(min, x);
            max=Math.max(max, x);

            if(hm.containsKey(x))
                hm.put(x, hm.get(x)+1);
            else
                hm.put(x, 1);
        }

        long diff = max-min;
        long ways = (long)hm.get(max)*hm.get(min);

        if(max==min)
        {
            int x = hm.get(max);
            int y = x-1;
            if(x%2==0)
                x=x/2;
            else y=y/2;

            ways = (long)x*y;
        }
        System.out.println(diff + " " + ways);
    }
  
}

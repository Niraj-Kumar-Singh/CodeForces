import java.util.HashMap;
import java.util.Scanner;

public class A43_Football
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s1=sc.nextLine();
        int max=1;

        HashMap<String, Integer> hm = new HashMap<>();
        String ans = sc.nextLine();
        hm.put(ans, 1);
//        System.out.println(ans);

        for(int i=1;i<n;i++)
        {
            String s = sc.nextLine();
//            System.out.println(s);
            if(hm.containsKey(s))
            {
                int x = hm.get(s);
                hm.put(s, x+1);

                if(x+1>max)
                {
                    ans=s;
                    max=x+1;
                }
            }
            else
            {
                hm.put(s, 1);
            }
        }


        System.out.println(ans);
    }
  
}

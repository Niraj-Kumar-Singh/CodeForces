import java.util.Scanner;

public class Contest160_A
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int t=sc.nextInt();
//        String x=sc.next();

        for(int i=0;i<t;i++)
        {
            String s = sc.next();

            int ans[] = getRatings(s);

            if(ans[0]==-1 && ans[1]==-1)
                System.out.println(-1);
            else
                System.out.println(ans[0] + " " + ans[1]);
        }
    }

    public static int[] getRatings(String s)
    {
        int i=s.length()-1;

        while(i>0)
        {
            String s1=s.substring(0,i);
            String s2=s.substring(i, s.length());
            int a=0;
            int b=0;
            if(s1.charAt(0)!='0' && s2.charAt(0)!='0')
            {
                 a = Integer.parseInt(s1);
                 b = Integer.parseInt(s2);
            }


            if(a<b)
                return new int[]{a, b};

            i--;
        }


        return new int[]{-1,-1};
    }
  
}

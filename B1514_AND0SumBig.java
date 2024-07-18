import java.util.Scanner;

public class B1514_AND0SumBig
{
    static int MOD = 1000000007;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long ans = 1;
            while(k>0)
            {
                ans=(ans*n)%MOD;
                k--;
            }
            System.out.println(ans);
        }
    }


  
}

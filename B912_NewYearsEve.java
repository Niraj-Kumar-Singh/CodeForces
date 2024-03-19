import java.util.Scanner;

public class B912_NewYearsEve
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if(k==1)
        {
            System.out.println(n);
        }
        else
        {
            long ans = 1;
            while(ans<n)
            {
                ans=ans*2+1;
            }

            System.out.println(ans);
        }
    }
  
}

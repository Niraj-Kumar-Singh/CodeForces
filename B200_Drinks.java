import java.util.Scanner;

public class B200_Drinks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum=0;
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            sum+=x;
        }

        double ans = (double)sum/n;

        System.out.println(ans);
    }
  
}

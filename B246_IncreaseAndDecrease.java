import java.util.Arrays;
import java.util.Scanner;

public class B246_IncreaseAndDecrease
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=sc.nextInt();
        }

        if(sum%n==0)
            System.out.println(n);
        else
            System.out.println(n-1);


    }
  
}

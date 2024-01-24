import java.util.Scanner;

public class A12_Cookies
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int x=0;
        int countOdd=0;
        int countEven=0;

        for(int i=0;i<n;i++)
        {
            x = sc.nextInt();

            if(x%2==0)
                countEven++;
            else
                countOdd++;
        }

        if(countOdd%2==0)
            System.out.println(countEven);
        else
            System.out.println(countOdd);
    }
  
}

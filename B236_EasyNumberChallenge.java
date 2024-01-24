import java.util.HashMap;
import java.util.Scanner;

public class B236_EasyNumberChallenge
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MOD = 1073741824 ;

        int prod=a*b*c;

        int arr[]= new int[prod+1];

        for(int i=1;i<=prod;i++)
        {
            for(int j=i;j<=prod;j+=i)
                arr[j]++;
        }


        int sum=0;

        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                for(int k=1;k<=c;k++)
                {
                    /****************** NOT RECOMMENDED - Can give TLE
//                    int divs = countDivisors(i*j*k);   ***************/

                    int divs = arr[i*j*k];
                    sum=(sum+divs)%MOD;
                }
            }
        }

        System.out.println(sum);

    }


/****************** NOT RECOMMENDED - Can give TLE ***************/
//    public static int countDivisors(int n)
//    {
//        if(n==1 || n==2)
//            return n;
//        int count=2;
//        for(int i=2;i<=n/2;i++)
//        {
//            if(n%i==0)
//                count++;
//        }
//
//        return count;
//    }


}

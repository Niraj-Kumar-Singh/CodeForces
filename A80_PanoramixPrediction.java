import java.util.Scanner;

public class A80_PanoramixPrediction
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int nxt=n+1;

        while(!isPrime(nxt))
        {
            nxt++;
        }

        if(nxt==m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }
}

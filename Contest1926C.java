import java.util.Scanner;

public class Contest1926C
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[2*100000+1];

        for(int i=1;i<=2*100000;i++)
        {
            arr[i]=arr[i-1]+getSum(i);
        }

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            printAns(sc, arr);
        }
    }

    public static void printAns(Scanner sc, long arr[])
    {
        int n = sc.nextInt();

        System.out.println(arr[n]);
    }

    public static long getSum(int n)
    {
        long sum=0;
        while(n!=0)
        {
            int d = n%10;
            sum+=d;
            n/=10;
        }

        return sum;
    }
  
}

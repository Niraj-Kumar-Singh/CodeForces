import java.util.Scanner;

public class Contest_1918A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long arr[] = new long[t];
        int n=0, m=0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();

            arr[i]=getBricks(n, m);
        }

        for(long x : arr)
            System.out.println(x);
    }

    public static long getBricks(int n, int m)
    {
        return (long)n*(m/2);
    }
  
}

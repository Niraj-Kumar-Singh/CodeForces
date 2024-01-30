import java.util.Scanner;

public class B1107_Digitalroot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = 0, x=0;
        long arr[] = new long[n];

        for(int i=0;i<n;i++)
        {
            k = sc.nextLong();
            x= sc.nextLong();;

            arr[i]=getKthNumber(k, x);
        }

        for(long num : arr)
            System.out.println(num);
    }

    public static long getKthNumber(long k, long x)
    {
        return x+(9*(k-1));
    }
  
}

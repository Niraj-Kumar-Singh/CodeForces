import java.util.Scanner;

public class C630_LuckyNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n+1];
        arr[1]=2;
        long total=2;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]*2;
            total+=arr[i];
        }

        System.out.println(total);
//      NOTE : Avoid using Math.pow() because it sometimes gives incorrect output
        // Fastest Method : Bitwise operations
//        System.out.println(((long)2<<n)-2);
    }
  
}

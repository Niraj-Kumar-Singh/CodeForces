import java.util.Arrays;
import java.util.Scanner;

public class Contest1934A_TooMinTooMax
{
    public static void main(String[] args)
    {
        Scanner sc  =  new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            getmax(sc);
        }
    }

    public static void getmax(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[n-1];
        int c = arr[1];
        int d = arr[n-2];

        System.out.println(Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-d)+Math.abs(d-a));
    }
  
}

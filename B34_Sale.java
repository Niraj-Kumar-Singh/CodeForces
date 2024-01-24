import java.util.Arrays;
import java.util.Scanner;

public class B34_Sale
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int i=0;
        int money=0;
        while(i<m && arr[i]<0)
        {
            money+=arr[i++];
        }

        System.out.println(-money);
    }
  
}

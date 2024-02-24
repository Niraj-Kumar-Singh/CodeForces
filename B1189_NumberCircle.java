import java.util.Arrays;
import java.util.Scanner;

public class B1189_NumberCircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        boolean isValid=true;
        if(arr[n-1]>=arr[n-3]+arr[n-2])
        {
            isValid=false;
        }




        if(isValid)
        {
            long t = arr[n-3];
            arr[n-3]=arr[n-2];
            arr[n-2]=arr[n-1];
            arr[n-1]=t;
            System.out.println("YES");
            for (long x : arr)
            {
                System.out.print(x+" ");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
  
}

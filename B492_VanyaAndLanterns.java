import java.util.Arrays;
import java.util.Scanner;

public class B492_VanyaAndLanterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int l = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        double maxDiff = arr[0];

        for(int i=0;i<n-1;i++)
        {
            maxDiff=Math.max(((double)(arr[i+1]-arr[i]))/2, maxDiff);
        }

        maxDiff = Math.max(maxDiff, l-arr[n-1]);

        System.out.println(String.format("%.10f", maxDiff));
    }
  
}

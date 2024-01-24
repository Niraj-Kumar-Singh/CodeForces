import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A347_DifferenceRow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int t = arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=t;

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
  
}

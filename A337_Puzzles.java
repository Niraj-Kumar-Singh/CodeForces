import java.util.Arrays;
import java.util.Scanner;

public class A337_Puzzles
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];

        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++)
        {
            int diff = arr[i+n-1]-arr[i];
            min = Math.min(diff, min);
        }

        System.out.println(min);
    }
}

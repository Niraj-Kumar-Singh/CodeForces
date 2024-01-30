import java.util.Arrays;
import java.util.Scanner;

public class B1300_AssigningToClasses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getMinAbsDiff(sc);
        }

        for(int x : ans)
            System.out.println(x);
    }

    public static int getMinAbsDiff(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[2*n];

        for(int i=0;i<2*n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);


        return arr[n]-arr[n-1];
    }
  
}

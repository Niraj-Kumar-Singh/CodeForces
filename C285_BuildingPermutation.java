import java.util.Arrays;
import java.util.Scanner;

public class C285_BuildingPermutation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long arr[]=new long[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }

        Arrays.sort(arr);

        long moves=0;
        int m=n;

        for(int i=n-1;i>=0;i--)
        {
            moves+=Math.abs(arr[i]-m);

            if(m>1)
                m--;
        }

        System.out.println(moves);
    }

  
}

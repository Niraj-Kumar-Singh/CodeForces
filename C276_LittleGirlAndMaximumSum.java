import java.util.Arrays;
import java.util.Scanner;

public class C276_LittleGirlAndMaximumSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int l=0, r=0;
        int count[]= new int[n];

        for(int i=0;i<m;i++)
        {
            l=sc.nextInt();
            r=sc.nextInt();

            count[l-1]++;
            if(r<n)
                count[r]--;

        }

        for(int i=1;i<n;i++)
        {
            count[i]+=count[i-1];
        }

        Arrays.sort(count);

        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(arr[i]*count[i]);
        }

        System.out.println(sum);





    }
  
}

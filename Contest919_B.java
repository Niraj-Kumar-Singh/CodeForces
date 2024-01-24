import java.util.Arrays;
import java.util.Scanner;

public class Contest919_B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int ans[] = new int[t];
        for(int i=0;i<t;i++)
        {
            ans[i]=getMaxSum(sc);
        }

        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }
    }

    public static int getMaxSum(Scanner sc)
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t=k;
        int x = sc.nextInt();

        int arr[] = new int[n];
        int sum[] = new int[n];
        int diff[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
//            diff[i]=-1*arr[i];
            if(i==0)
                sum[i]=arr[i];
            else
            {
                sum[i]=sum[i-1]+arr[i];
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {

//            diff[i]=-1*arr[i];
            if(i==0)
                sum[i]=arr[i];
            else
            {
                sum[i]=sum[i-1]+arr[i];
            }
        }

        diff[0]=-1*arr[0];
        for(int i=1;i<x;i++)
        {
            diff[i]=diff[i-1]-arr[i];
        }

        for(int i=x;i<n;i++)
        {
            diff[i]=diff[i-1]-arr[i]+arr[i-x];
        }
        int ans = -1*sum[n-1];

//        System.out.println("Sum="+Arrays.toString(sum));
//        System.out.println("diff="+Arrays.toString(diff));
        for(int i=n-1;i>=0 && k>=0;i--)
        {
//            int diffSum = 0;
//            int j=i;
//            for(;j>i-x && j>=0;j--)
//                diffSum+=diff[j];
//
//
//            int s=0;
//            if(j>=0)
//                s=sum[j];

            int currDiff = sum[i]+(2*diff[i]);

//            ans=Math.max(ans, diffSum+s);
            ans=Math.max(ans, currDiff);
            k--;
        }









        if(t>=n)
            ans=Math.max(ans, 0);
        return ans;

    }
}

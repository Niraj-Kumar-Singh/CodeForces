import java.util.Scanner;

public class B363_Fence
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int minSum = 0;
        int minIndex = 0;
        for(int i=0;i<k;i++)
        {
            minSum+=arr[i];
        }

        int currSum=minSum;

        for(int i=1;i<=n-k;i++)
        {
            currSum-=arr[i-1];
            currSum+=arr[i+k-1];

            if(currSum<minSum)
            {
                minSum=currSum;
                minIndex=i;
            }
        }

        System.out.println(minIndex+1);
    }
}

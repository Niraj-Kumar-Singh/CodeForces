import java.util.Scanner;

public class C1169_IncreasingbyModulo
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

        int start = 0, end = m;

        while(start<end)
        {
            int mid = start + (end-start)/2;

            if(isValid(mid, arr, m))
                end=mid;
            else
                start=mid+1;
        }

        if(isValid(start, arr, m))
            System.out.println(start);
        else
            System.out.println(end);

    }

    public static boolean isValid(int max, int arr[], int m)
    {
        int prev = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(prev<=arr[i])
            {
                int k = m - (arr[i]-prev);
                if(k>max)
                    prev=arr[i];
            }
            else
            {
                int k = prev-arr[i];
                if(k>max)
                    return false;
            }


        }

        return true;
    }
}

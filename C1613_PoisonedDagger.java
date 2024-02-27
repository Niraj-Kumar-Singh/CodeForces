import java.util.Scanner;

public class C1613_PoisonedDagger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println(getAns(sc));
        }
    }

    public static long getAns(Scanner sc)
    {
        int n = sc.nextInt();
        long h = sc.nextLong();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n==1)
        {
            return h;
        }
        long start=0, end = h;
        while(start<=end)
        {
            long mid = start + (end-start)/2;

            long k = 0;
            for(int i=0;i<n-1;i++)
            {
                k+=Math.min(arr[i+1]-arr[i], mid);
            }
            k+=mid;

            if(k<h)
                start=mid+1;
            else
                end=mid-1;
        }

        return start;


    }
  
}

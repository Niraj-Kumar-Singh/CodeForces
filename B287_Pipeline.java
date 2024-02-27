import java.util.Scanner;

public class B287_Pipeline
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        System.out.println(getAns(n, k));
    }

    public static long getAns(long n, long k)
    {
        if(n==1)
            return 0;

        if(n<=k)
            return 1;

        n--;
        long sum = (k*(k-1))/2;

        if(n>sum)
            return -1;

        long start=0, end=k-1;

        while(start<=end)
        {
            long mid = start+(end-start)/2;
            long remainingOutlets = (mid*(mid+1))/2;


            if(sum-remainingOutlets<n)
                end=mid-1;
            else
                start=mid+1;
        }



        return k-1-end;
    }
  
}

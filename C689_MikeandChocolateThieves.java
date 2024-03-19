import java.util.Scanner;

public class C689_MikeandChocolateThieves
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();

        long start = 0, end = Long.MAX_VALUE;
        long ans=-1;

        while(start<=end)
        {
            long mid= start+(end-start)/2;

            long r = getNumberOfStartingValues(mid);

            if(r==m)
                ans=mid;

            if(r<m)
                start=mid+1;
            else
                end=mid-1;
        }

        System.out.println(ans);
    }

    public static long getNumberOfStartingValues(long cap)
    {
        long r=0;

        for(long k=2 ; (k*k*k)<=cap ; k++)
        {
            r+=cap/(k*k*k);
        }

        return r;
    }
  
}

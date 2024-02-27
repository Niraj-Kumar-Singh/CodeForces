import java.util.Scanner;

public class D1670_MagicPowder1And2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }

        long start=0;
        long end =Integer.MAX_VALUE;


        while(start<=end)
        {
            long mid = start+(end-start)/2;

            long currIng[] = new long[n];

            for(int i=0;i<n;i++)
            {
                currIng[i]=a[i]*mid;
            }

            long currCost[] = new long[n];
            long cost=0;
            for(int i=0;i<n;i++)
            {
                currCost[i]= a[i]==0 ? 0 : currIng[i] >= b[i] ? (currIng[i]-b[i]) : 0;
                cost+=currCost[i];
                if(cost<0)
                {
                    cost=Long.MAX_VALUE;
                }
            }


            if(cost<=k)
            {
                start=mid+1;
            }
            else
                end=mid-1;
        }

        System.out.println(end);


    }
  
}

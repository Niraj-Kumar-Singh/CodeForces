import java.util.HashSet;
import java.util.Scanner;

public class A215_BicycleChain
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[]=new int[m];
        HashSet<Integer> hs = new HashSet<>();
        int bj=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            int x = sc.nextInt();
            brr[i]=x;
            hs.add(x);
            bj=Math.max(x, bj);
        }


        int ratio = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(brr[j]%arr[i]==0)
                {
                    int currRatio = brr[j]/arr[i];

                    if(currRatio>ratio)
                    {
                        ratio=currRatio;
                    }

                    break;
                }
            }

        }


        int count=0;
        int index=0;
        while(index<n)
        {
            int num = arr[index]*ratio;
            if(hs.contains(num))
                count++;

            if(num>bj)
                break;

            index++;

        }

        System.out.println(count);

    }
}

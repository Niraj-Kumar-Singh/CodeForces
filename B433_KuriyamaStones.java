import java.util.Arrays;
import java.util.Scanner;

public class B433_KuriyamaStones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long arr[] = new long[n];
        long arrSorted[] = new long[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
            arrSorted[i]=arr[i];
        }

        Arrays.sort(arrSorted);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrSorted));

        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
            arrSorted[i]+=arrSorted[i-1];
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrSorted));

        int m = sc.nextInt();

        for(int i=0;i<m;i++)
        {
            int type = sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();





            long sum=0;



            if(type==2)
            {
                if(l>1)
                    sum=arrSorted[r-1]-arrSorted[l-2];
                else
                    sum=arrSorted[r-1];
            }
            else
            {
                if(l>1)
                    sum=arr[r-1]-arr[l-2];
                else
                    sum=arr[r-1];
            }

            System.out.println(sum);
        }

    }
  
}

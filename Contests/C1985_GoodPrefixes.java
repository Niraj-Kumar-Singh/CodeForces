import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C1985_GoodPrefixes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static int getAns(Scanner sc )
    {
        int n = sc.nextInt();

        int arr[] = new int[n];

        long sum[] = new long[n];
        arr[0]=sc.nextInt();
        sum[0]=arr[0];
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put((long)arr[0], 0);

        for(int i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum[i]=sum[i-1]+arr[i];

            if(!hm.containsKey((long)arr[i]))
                hm.put((long)arr[i], i);
        }

        int count=0;
//        if(arr[0]==0)
//            count++;

//        System.out.println(Arrays.toString(sum));
//        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++)
        {
            long currSum=sum[i];
            long x = currSum/2;
//            System.out.println(hm.get(x));
            if(currSum%2==0 && hm.containsKey(x) && hm.get(x)<=i)
                count++;
//            for(int j=0;j<=i;j++)
//            {
//                if(currSum-arr[j]==arr[j])
//                {
//                    count++;
////                    System.out.println(i);
//                    break;
//                }
//            }
        }


        return count;
    }
  
}

import java.util.Arrays;
import java.util.Scanner;

public class Contest912_A
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int tests=sc.nextInt();
//        System.out.println("Test cases="+tests);

        for(int i=0;i<tests;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
//            System.out.println("n="+n + " k="+k);
            int arr[]=new int[n];

//            System.out.println("Input start");
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
//            System.out.println("Input completed");
            if(isPossible(arr, n, k))
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }

    public static boolean isPossible(int arr[], int n, int k)
    {

        for(int i=0;i<n-1;i++)
        {
//            int count=1;
//            int j=i;
//            while(j<n-1 && arr[j]>arr[j+1])
//            {
//                j++;
//                count++;
//            }
//
//            i=j;
//
//            if(count>k)
//                return false;


            if(arr[i]>arr[i+1])
            {
                int j=i+1;

                while(j<n && arr[j-1]>arr[j])
                    j++;

                if(j-i>k)
                    return false;

            }
        }




        return true;


    }
  
}

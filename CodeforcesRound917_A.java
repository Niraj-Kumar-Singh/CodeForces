import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesRound917_A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];

            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }

            displayLeastProduct(arr);
        }
    }

    public static void displayLeastProduct(int arr[])
    {
//        System.out.println(Arrays.toString(arr));
        int countNegatives=0;
        int count0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                countNegatives++;
            else if(arr[i]==0)
                count0++;
        }

        if(countNegatives%2==0 && count0==0)
        {
            System.out.println(1);
            System.out.println(1 + " "+ 0);
        }
        else
        {
            System.out.println(0);
        }

    }
  
}

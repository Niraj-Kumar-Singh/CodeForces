import java.util.Scanner;

public class A233_PerfectPermutation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]=new int[n];

        if(n%2!=0)
            System.out.println(-1);
        else
        {
            for(int i=0;i<n;i++)
            {
                arr[i]=i+1;
            }
//            if(n%2!=0)
//            {
//                int t = arr[0];
//                arr[0]=arr[2];
//                arr[2]=t;
//            }

            for(int i=1;i<n;i+=2)
            {
                int t = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=t;
            }

            System.out.print(arr[0]);
            for (int i=1;i<n;i++)
            {
                System.out.print(" "+arr[i]);
            }
        }
    }
  
}

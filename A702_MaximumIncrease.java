import java.util.Scanner;

public class A702_MaximumIncrease
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int maxLen=1;

        for(int i=0;i<n-1;i++)
        {
            int j=i;

            while(j<n-1 && arr[j]<arr[j+1])
                j++;


            maxLen=Math.max(maxLen, j-i+1);
            i=j;
        }

        System.out.println(maxLen);


    }
  
}

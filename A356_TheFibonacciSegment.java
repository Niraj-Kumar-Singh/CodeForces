import java.util.Scanner;

public class A356_TheFibonacciSegment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int maxLen=2;

        for(int i=2;i<n;i++)
        {
            int j=i;
            int currLen=0;
            while(j<n && arr[j]==arr[j-1]+arr[j-2])
            {
                j++;
                currLen++;
            }


            maxLen=Math.max(maxLen, currLen+2);
            i=j;
        }

        if(arr.length>1)
            System.out.println(maxLen);
        else
            System.out.println(1);
    }
  
}

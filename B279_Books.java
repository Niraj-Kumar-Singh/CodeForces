import java.util.Scanner;

public class B279_Books
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;

        int r=0;
        for(int i=0;i<n;i++)
        {
            while(r<n && m-arr[r]>=0)
            {
                m-=arr[r];
                r++;
            }

            count=Math.max(count, r-i);
            m+=arr[i];
        }

        System.out.println(count);
    }
  
}

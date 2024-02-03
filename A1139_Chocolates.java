import java.util.Scanner;

public class A1139_Chocolates
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

        long total=arr[n-1];
        int last = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<last)
            {
                last=arr[i];
                total+=last;

            }
            else
            {
                last-=1;
                if(last<1)
                    break;

                total+=last;

            }
        }

        System.out.println(total);
    }
  
}

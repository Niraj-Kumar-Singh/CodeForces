import java.util.Scanner;

public class A500_NewYearTransportation
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for(int i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        int i=1;
        boolean isPossible = false;
        while(i<n)
        {
            if(i+arr[i]==t)
            {
                isPossible=true;
                break;
            }

            i=i+arr[i];

        }

        if(isPossible)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

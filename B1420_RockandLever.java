import java.util.Scanner;

public class B1420_RockandLever
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println(getAns(sc));
        }
    }

    public static long getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        long ans=0;
        long bits[] = new long[33];

        for(int x : arr)
        {
            int count=0;
            while(x>0)
            {
                x=x>>1;
                count++;
            }

            bits[count]++;
        }


        for(long bit : bits)
        {
            ans+=(bit*(bit-1))/2;
        }

        return ans;
    }
  
}

import java.util.Scanner;

public class A349_CinemaLine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int arr[]=new int[n];
        int bills[]=new int[101];

        boolean isPossible=true;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int rem=arr[i]-25;


            if(rem==75)
            {
                if(bills[50]>=1 && bills[25]>=1)
                {
                    bills[50]--;
                    bills[25]--;
                }
                else if(bills[25]>=3)
                {
                    bills[25]-=3;
                }
                else
                {
                    isPossible=false;
                    break;
                }
            }

            if(rem==25)
            {
                if(bills[25]>=1)
                    bills[25]--;
                else
                {
                    isPossible=false;
                    break;
                }
            }


            bills[arr[i]]++;

        }


        if(isPossible)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

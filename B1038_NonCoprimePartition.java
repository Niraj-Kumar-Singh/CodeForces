import java.util.Scanner;

public class B1038_NonCoprimePartition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        if(n<=2)
            System.out.println("No");
        else
        {
            int k =0;
            if(n%2==0)
                k=n/2;
            else
                k=(n+1)/2;

            System.out.println("Yes");
            System.out.println(1 + " " + k);

            System.out.print(n-1);

            for(int i=1;i<=n;i++)
            {
                if(i==k)
                    continue;

                System.out.print(" "+i );
            }

        }
    }
  
}

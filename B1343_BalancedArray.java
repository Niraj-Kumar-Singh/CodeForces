import java.util.Scanner;

public class B1343_BalancedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int n = 0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            if((n/2)%2!=0)
                System.out.println("NO");
            else
                printAns(n);
        }
    }

    public static void printAns(int n)
    {
        System.out.println("YES");
        int sum = 0;
        int x=2;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(x+" ");
            sum+=x;
            x+=2;
        }

        x=1;
        for(int i=0;i<n/2-1;i++)
        {
            System.out.print(x+" ");
            sum-=x;
            x+=2;
        }
        System.out.println(sum);
    }
  
}

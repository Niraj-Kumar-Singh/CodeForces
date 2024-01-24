import java.util.Scanner;

public class A118_PresentFromLena
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            displayLine(i, n);
        }

        for(int i=n-1;i>=0;i--)
        {
            displayLine(i, n);
        }
    }


    public static void displayLine(int start, int end)
    {
        int spaces = end-start;
        while(spaces>0)
        {
            System.out.print("  ");
            spaces--;
        }

        System.out.print("0");
        for(int j=1;j<=start;j++)
        {
            System.out.print(" "+j);
        }

        for(int j=start-1;j>=0;j--)
        {
            System.out.print(" "+j);
        }


        System.out.println();
    }
  
}

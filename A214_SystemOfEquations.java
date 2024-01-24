import java.util.Scanner;

public class A214_SystemOfEquations
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int count=0;
        int min=Math.min(n, m);

        for(int i=0;i*i<=min;i++)
        {
            int a=i;
            int b=min-i*i;

            if(((a*a + b) == n && (a + b*b) == m) || ((a*a + b) == m && (a + b*b) == n))
                count++;
        }

        System.out.println(count);
    }
}

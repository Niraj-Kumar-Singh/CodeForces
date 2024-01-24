import java.util.Scanner;

public class B344_SimpleMolecules
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = a+b+c;
        if(ans%2!=0)
        {
            System.out.println("Impossible");
        }
        else
        {
            ans=ans/2;
            if(ans>=a && ans>=b && ans>=c)
            {
                System.out.println((ans-c) + " " + (ans-a) + " " + (ans-b));
            }
            else
            {
                System.out.println("Impossible");
            }
        }
}
  
}

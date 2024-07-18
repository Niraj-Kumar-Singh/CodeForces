import java.util.Scanner;

public class A1915_OddOneOut
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a^b)==0)
                System.out.println(c);
            else if((b^c)==0)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }
  
}

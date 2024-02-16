import java.util.Scanner;

public class A1353_MostUnstableArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n=0, m=0;

        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();

            if(n==1)
                System.out.println(0);
            else if(n==2)
                System.out.println(m);
            else
                System.out.println(2*m);
        }
    }
  
}

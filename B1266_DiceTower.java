import java.util.Scanner;

public class B1266_DiceTower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long n=0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextLong();
            if(n<15)
                System.out.println("NO");
            else
            {
                n=n%14;

                if(n>=1 && n<=6)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }
  
}

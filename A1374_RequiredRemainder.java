import java.util.Scanner;

public class A1374_RequiredRemainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            getAns(sc);
        }
    }

    public static void getAns(Scanner sc)
    {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int rem = n%x;

        if(rem<y)
        {
            n-=x;
        }

//        n-=rem;
//        n+=y;

        n+=y-rem;

        System.out.println(n);
    }

  
}

import java.util.HashSet;
import java.util.Scanner;

public class B1257_MagicStick
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
        int x= sc.nextInt();
        int y= sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(x);
        if(x==y || x>y)
        {
            System.out.println("YES");
            return;
        }

        if(x==1)
        {
            System.out.println("NO");
            return;
        }

        while(x<y)
        {
            if(x%2==0)
            {
                x/=2;
                x*=3;
            }
            else if(x>1)
            {
                x--;
            }
            else
            {
                break;
            }


            if(hs.contains(x))
            {
                System.out.println("NO");
                return;
            }

            hs.add(x);


        }

        System.out.println("YES");
    }
  
}

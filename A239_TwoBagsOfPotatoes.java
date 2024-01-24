import java.util.ArrayList;
import java.util.Scanner;

public class A239_TwoBagsOfPotatoes
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();  // 10
        int k = sc.nextInt();  // 6
        int n = sc.nextInt();  // 40

        int x = k-y%k;
        int maxX = n-y;
        String ans="";

        if(x<=maxX)
        {

//            System.out.println(x);
            ans+=x;
            x+=k;
            while(x<=maxX)
            {
//                System.out.print(" " + x);
                ans+=" "+x;
                x+=k;
            }

            System.out.println(ans);
        }
        else
            System.out.println(-1);
    }
}

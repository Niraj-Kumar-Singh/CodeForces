import java.util.Scanner;

public class A476_DreamoonAndStairs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i=n/2;
//        if(n%2==0)
//            i--;
        int min=Integer.MAX_VALUE;

        while(i>=0)
        {
            int steps = i+(n-(2*i));
//            System.out.println("At i="+i+", Step="+steps);
            if(steps%m==0)
            {
                min=Math.min(min, i+(n-(2*i)));
//                System.out.println("Min="+min);
                break;
            }

            i--;
        }

        if(i>=0)
            System.out.println(min);
        else
            System.out.println(-1);

    }
  
}

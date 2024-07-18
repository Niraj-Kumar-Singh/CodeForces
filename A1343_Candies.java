import java.util.Scanner;

public class A1343_Candies
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }


    public static int getAns(Scanner sc)
    {
        int n = sc.nextInt();

        for(int k = 2;k<30;k++)
        {
            int d = (1<<k)-1;

            if(n%d==0)
                return n/d;
        }


        return -1;
    }
  
}

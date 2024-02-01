import java.util.Scanner;

public class A1141_Game23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getNumberOfWays(n, m));
    }

    public static int getNumberOfWays(int n, int m)
    {
        if(m%n!=0)
            return -1;


//        System.out.println("here");
        int num = m/n;
        int count=0;
        while(num!=1)
        {
            if(num%3==0)
            {
                num/=3;
                count++;
            }
            else if(num%2==0)
            {
                num/=2;
                count++;
            }
            else
                return -1;
        }

        return count;


    }
  
}

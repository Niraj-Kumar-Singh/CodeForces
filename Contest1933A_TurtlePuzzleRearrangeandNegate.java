import java.util.Scanner;

public class Contest1933A_TurtlePuzzleRearrangeandNegate
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();

        for(int i =0;i<t;i++)
        {
            getAns(sc);
        }
    }
    public static void getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int x = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            x = sc.nextInt();
            sum+=Math.abs(x);
        }

        System.out.println(sum);
    }
  
}

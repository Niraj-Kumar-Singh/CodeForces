import java.util.Scanner;

public class A1283_MinutesBeforetheNewYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int h = sc.nextInt();
            int m = sc.nextInt();

            int minutes = (23-h)*60+(60-m);

            System.out.println(minutes);


        }

    }
  
}

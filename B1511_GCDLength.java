import java.util.Scanner;

public class B1511_GCDLength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            printAns(sc);
        }
    }

    public static void printAns(Scanner sc)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String firstString = "1" + "0".repeat(a - 1);
        String secondString = "1".repeat(b - c + 1) + "0".repeat(c - 1);

        System.out.println(firstString + " " + secondString);
    }
}

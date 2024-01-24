import java.util.Scanner;

public class B337_RoutineProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = a*d, y = b*c;
        int numerator = Math.max(x, y)-Math.min(x, y);
        int denominator = Math.max(x, y);

        int factor = gcd(numerator, denominator);

        System.out.println(numerator/factor + "/"+denominator/factor);
    }

    public  static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
  
}

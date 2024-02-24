import java.util.Scanner;

public class D630_Hexagons
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sum = 1;

        sum+=(n*(12+(long)(n-1)*6))/2;

        System.out.println(sum);
    }
  
}

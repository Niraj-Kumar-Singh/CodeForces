import java.util.Scanner;

public class A124_TheNumberOfPositions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();


        System.out.println(n-Math.max(a,n-b-1));
    }
  
}

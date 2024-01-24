import java.util.Scanner;

public class A336_VasilyTheBearAndTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        int d = Math.abs(l)+Math.abs(b);

        if(l>0 && b>0)
        {
            System.out.println(0 +" "+ d + " " + d + " " + 0);
        }
        else if(l<0 && b>0)
        {
            System.out.println(-d + " " + 0 + " " + 0 + " " + d);
        }
        else if(l<0 && b<0)
        {
            System.out.println(-d + " " + 0 + " " + 0 + " " + -d);
        }
        else
        {
            System.out.println(0 +" "+ -d + " " + d + " " + 0);
        }
    }
  
}

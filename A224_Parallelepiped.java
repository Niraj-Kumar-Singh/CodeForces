import java.util.Scanner;

public class A224_Parallelepiped
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int ab = sc.nextInt();
        int ac = sc.nextInt();
        int bc = sc.nextInt();

        int a = (int)Math.sqrt((ab*ac)/bc);
        int c = (int)Math.sqrt((ac*bc)/ab);
        int b = (int)Math.sqrt((ab*bc)/ac);

        System.out.println(4*(a+b+c));
    }

}

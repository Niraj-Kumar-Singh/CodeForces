import java.util.Scanner;

public class A1337_IchihimeandTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans[] = new String[t];

        int a=0, b=0, c=0, d=0;
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            ans[i]=getSides(a, b, c, d);
        }

        for(String s : ans)
            System.out.println(s);
    }

    public static String getSides(int a, int b, int c, int d)
    {
        return b+" "+c+" "+c;
    }
  
}

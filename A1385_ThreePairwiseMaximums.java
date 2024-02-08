import java.util.Scanner;

public class A1385_ThreePairwiseMaximums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();

        int x=0, y=0, z=0;
        for(int i=0;i<t;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            getAns(x, y, z);
        }
    }

    public static void getAns(int x, int y, int z)
    {
        if(x==y && y==z && x==z)
        {
            System.out.println("YES");
            System.out.println(x+" "+x+" "+x);
        }
        else if(x!=y && y!=z && x!=z)
        {
            System.out.println("NO");
        }
        else if(x==y)
        {
            if(z>x)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                System.out.println(x+" "+z+" "+z);
            }
        }
        else if(z==y)
        {
            if(z<x)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                System.out.println(x+" "+x+" "+z);
            }
        }
        else if(x==z)
        {
            if(y>x)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                System.out.println(x+" "+y+" "+y);
            }
        }
    }

}

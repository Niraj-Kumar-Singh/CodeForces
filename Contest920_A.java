import java.util.Scanner;

public class Contest920_A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getArea(sc);
        }

        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }

    }

    public static int getArea(Scanner sc)
    {
        int x1=sc.nextInt(), y1=sc.nextInt();
        int x2=sc.nextInt(), y2=sc.nextInt();
        int x3=sc.nextInt(), y3=sc.nextInt();
        int x4=sc.nextInt(), y4=sc.nextInt();

        int a=0, b=0;

        if(x1==x2)
        {
            a=Math.abs(y2-y1);
            if(y1==y3)
                b=Math.abs(x3-x1);
            else
                b=Math.abs(x4-x1);
        }
        else if(x1==x3)
        {
            a=Math.abs(y3-y1);
            if(y1==y2)
                b=Math.abs(x2-x1);
            else
                b=Math.abs(x4-x1);
        }
        else if(x1==x4)
        {
            a=Math.abs(y4-y1);
            if(y1==y2)
                b=Math.abs(x2-x1);
            else
                b=Math.abs(x3-x1);
        }


        return a*b;
    }

  
}

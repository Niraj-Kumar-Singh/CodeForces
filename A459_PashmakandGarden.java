import java.util.Scanner;

public class A459_PashmakandGarden
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        int x3=x1;
        int y3=y2;
        int x4=x2;
        int y4=y1;

        double height = ((Math.abs(x3-x1) * Math.abs(x3-x1))+(Math.abs(y3-y1) * Math.abs(y3-y1)));
        double base = ((Math.abs(x3-x2) * Math.abs(x3-x2))+(Math.abs(y3-y2) * Math.abs(y3-y2)));
        double hypotenuse = ((Math.abs(x2-x1) * Math.abs(x2-x1))+ (Math.abs(y2-y1) * Math.abs(y2-y1)));

//        System.out.println("x3, y3 = " + Math.abs(x2-x1) + " " + Math.abs(y2-y1));

//        System.out.println(height);
//        System.out.println(base);
//        System.out.println(hypotenuse);
        if(x1==x2 || y1==y2)
        {
            if(x1==x2)
            {
                int l = Math.abs(y2-y1);
                System.out.println((x1+l) + " " + y1 + " " + (x2+l) + " " + y2);
            }
            else
            {
                int l = Math.abs(x2-x1);
                System.out.println(x1 + " " + (y1+l) + " " + x2 + " " + (y2+l));
            }
        }
        else if(Math.abs(x3-x1)==Math.abs(y3-y2) && Math.abs(y3-y1)==Math.abs(x3-x2))
        {
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
        else
        {
            System.out.println(-1);
        }

    }
  
}

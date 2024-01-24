import java.util.Scanner;

public class A165_SupercentralPoint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int points[][] = new int[n][2];

        for(int i=0;i<n;i++)
        {
            points[i][0] = sc.nextInt();
            points[i][1]=sc.nextInt();


        }

        int count=0;
        for(int i=0;i<n;i++)
        {
            int x = points[i][0];
            int y = points[i][1];

//            System.out.println("x="+x+" "+"y="+y);

            boolean upper=false, lower=false, left=false, right=false;
            for(int j=0;j<n;j++)
            {
                if(j==i)
                    continue;

                int x1 = points[j][0];
                int y1 = points[j][1];

//                System.out.println("x1="+x1+" "+"y1="+y1);

                if(x1>x && y1==y)
                    right=true;
                else if(x1<x && y1==y)
                    left=true;
                else if(x1==x && y1<y)
                    lower=true;
                else if(x1==x && y1>y)
                    upper=true;
            }

//            System.out.println();


            if(upper && lower && left && right)
                count++;
        }


        System.out.println(count);
    }
  
}

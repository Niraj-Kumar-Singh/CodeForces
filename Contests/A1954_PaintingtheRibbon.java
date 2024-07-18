import java.util.Scanner;

public class A1954_PaintingtheRibbon
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int x = n/m;
            if(n%m>0)
                x++;

//            System.out.println(x);
//            System.out.println(n-x);
            if(n-x<=k || n==k || n==x)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
  
}

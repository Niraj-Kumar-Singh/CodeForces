import java.util.Scanner;

public class A1928_RectangleCutting
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] =  new int[t];


        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==1 && b==1)
                System.out.println("NO");
            else if(a%2==0 && b%2==0)
            {
                if(a/2!=b || b/2!=a)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(a%2==0)
            {
                if(a/2==b)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(b%2==0){
                if (b / 2 == a)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
  
}

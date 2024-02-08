import java.util.Scanner;

public class A1294_CollectingCoins
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a=0, b=0, c=0, n=0, max=0;
        for(int i=0;i<t;i++)
        {
            a = sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            n=sc.nextInt();

            max=Math.max(a, Math.max(b,c));
            max=(max-a)+(max-b)+(max-c);
            n-=max;

            if(n<0 || (n>0 && n%3!=0))
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }
  
}

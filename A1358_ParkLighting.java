import java.util.Scanner;

public class A1358_ParkLighting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n=0, m=0;
        int x=0, y=0;
        int ans=0;

        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();

            x=Math.max(n, m);
            y=Math.min(n, m);

            ans = y*(x/2)+(x%2!=0 ? (y%2!=0 ? y/2+1 : y/2) : 0);
            System.out.println(ans);
        }
    }
  
}

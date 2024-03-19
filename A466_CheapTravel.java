import java.util.Scanner;

public class A466_CheapTravel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int times = n/m;
        if(n%m!=0)
            times++;
        int ans= n*a;
        for(int i=1;i<=times;i++)
        {
            int remaining = Math.max(n-i*m, 0);
            int cost = i*b+remaining*a;
            ans=Math.min(cost, ans);
        }

        System.out.println(ans);
    }
  
}

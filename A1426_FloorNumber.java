import java.util.Scanner;

public class A1426_FloorNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int ans[] = new int[t];

        int n=0, x=0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            x=sc.nextInt();

            ans[i]=getFloor(n, x);
        }

        for(int z : ans)
            System.out.println(z);
    }

    public static int getFloor(int n, int x)
    {
        if(n<=2)
            return 1;
        if(n-2<=x)
            return 2;

        int floor=1;
        n-=2;
        floor+=n/x+(n%x==0?0:1);

        return floor;
    }
  
}

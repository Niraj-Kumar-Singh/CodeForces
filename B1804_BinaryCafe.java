import java.util.Scanner;

public class B1804_BinaryCafe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            k=Math.min(k,30);

            System.out.println(Math.min(n, (1<<k)-1)+1);


        }
    }
  
}

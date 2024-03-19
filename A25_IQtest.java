import java.util.Scanner;

public class A25_IQtest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x=0;
        int even=-1, odd=-1, countEven=0;

        for(int i=1;i<=n;i++)
        {
            x=sc.nextInt();
            if(x%2==0)
            {
                countEven++;
                even=i;
            }
            else
            {
                odd=i;
            }
        }

        if(countEven==1)
            System.out.println(even);
        else
            System.out.println(odd);
    }
  
}

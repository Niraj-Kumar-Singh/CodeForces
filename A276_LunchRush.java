import java.util.Scanner;

public class A276_LunchRush
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k =sc.nextInt();

        int fi=0, ti=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            fi=sc.nextInt();
            ti=sc.nextInt();

            if(ti<=k)
            {
                max=Math.max(fi, max);
            }
            else
            {
                max=Math.max(fi-(ti-k), max);
            }
        }


        System.out.println(max);
    }
  
}

import java.util.Scanner;

public class A273_FreeCash
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int lastHour=sc.nextInt();
        int lastMinute=sc.nextInt();

        int count=1;
        int max=1;
        for(int i=1;i<n;i++)
        {
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(h==lastHour && m==lastMinute)
                max++;
            else
                max=1;

            lastHour=h;
            lastMinute=m;

            count=Math.max(count, max);
        }


        System.out.println(count);
    }
  
}

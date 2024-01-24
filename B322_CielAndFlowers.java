import java.util.Scanner;

public class B322_CielAndFlowers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int max=0;

        int reduce=0;

        if(r==g && g==b)
        {
            System.out.println(r);
        }
        else if(r%3==0 && g%3==0 && b%3==0)
        {
            System.out.println(r/3 + g/3 + b/3);
        }
        else
        {
            while(reduce<3 && reduce<=Math.min(r, Math.min(g, b)))
            {
                int sum = reduce + ((r-reduce)/3 + (g-reduce)/3 + (b-reduce)/3);
                max = Math.max(sum, max);

                reduce++;
            }

            System.out.println(max);
        }


    }
  
}

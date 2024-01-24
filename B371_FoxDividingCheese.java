import java.util.Scanner;

public class B371_FoxDividingCheese
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum=0;
        int div = gcd(a, b);

        a=a/div;
        b=b/div;

        int count=0;

        while(a!=1)
        {
            if(a%2==0)
                a=a/2;
            else if(a%3==0)
                a=a/3;
            else if(a%5==0)
                a=a/5;
            else
                break;

            count++;
        }

        while(b!=1)
        {
            if(b%2==0)
                b=b/2;
            else if(b%3==0)
                b=b/3;
            else if(b%5==0)
                b=b/5;
            else
                break;

            count++;
        }

        if(a==1 && b==1)
            System.out.println(count);
        else
            System.out.println(-1);


    }

    public static int gcd(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
  
}

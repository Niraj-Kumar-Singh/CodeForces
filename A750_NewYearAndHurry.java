import java.util.Scanner;

public class A750_NewYearAndHurry
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();

        while(n>0)
        {
            int sum = (5*n*(n+1))/2 + k;
            if(sum<=240)
                break;

            n--;
        }

        System.out.println(n);
    }
  
}

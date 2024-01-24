import java.util.Scanner;

public class A285_SlightlyDecreasingPermutations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k--!=0)
        {
            System.out.print(n-- + " ");
        }

        for(int i=1;i<=n;i++)
        {
            System.out.print(i + " ");
        }
    }

  
}

import java.util.Scanner;

public class A9_DieRoll
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int num = 6-Math.max(a, b)+1;

        int factor=6;
        while(num%factor!=0 || 6%factor!=0)
        {
            factor--;
        }


//        System.out.println(factor);
        System.out.println((num/factor)+"/"+(6/factor));


    }
  
}

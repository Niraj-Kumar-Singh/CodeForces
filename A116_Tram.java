import java.util.Scanner;

public class A116_Tram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int max=0;
        int capacity=0;

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            capacity-=a;
            capacity+=b;

            max=Math.max(max, capacity);
        }

        System.out.println(max);
    }
  
}

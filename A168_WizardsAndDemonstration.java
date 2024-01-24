import java.util.Scanner;

public class A168_WizardsAndDemonstration
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(Math.max(0, (int)Math.ceil((double)(n*y)/100)-x));
    }
  
}

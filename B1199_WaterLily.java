import java.util.Scanner;

public class B1199_WaterLily
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int L = sc.nextInt();

        double x = ((double)L*L-(double)H*H)/((double)2*H);
        System.out.println(x);
    }
  
}

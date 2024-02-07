import java.util.Scanner;

public class A959_MahmoudandEhabandtheevenoddgame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n%2==0 ? "Mahmoud" : "Ehab");
    }
  
}

import java.util.Scanner;

public class B688_LovelyPalindromes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        StringBuilder s = new StringBuilder();
        s.append(str);

        System.out.println(str+s.reverse());
    }
  
}

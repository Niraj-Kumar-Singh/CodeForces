import java.util.Scanner;

public class A41_Translation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
        StringBuilder sb = new StringBuilder(s2);

        if(s1.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

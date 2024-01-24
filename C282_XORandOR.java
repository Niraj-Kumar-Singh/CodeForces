import java.util.Arrays;
import java.util.Scanner;

public class C282_XORandOR
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(getAns(a, b));

    }

    public static String getAns(String a, String b)
    {
        if(a.length()!=b.length())
            return "NO";

        if(a.equals(b))
            return "YES";

        if(!a.contains("1") || !b.contains("1"))
            return "NO";

        return "YES";
    }
}

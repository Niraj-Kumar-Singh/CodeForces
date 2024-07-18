import java.util.Scanner;

public class A1494_ABCString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0)
        {
            System.out.println(getAns(sc));

        }
    }

    public static String getAns(Scanner sc)
    {
        String s = sc.nextLine();
        if(s.charAt(0)==s.charAt(s.length()-1))
            return "NO";


        return "";
    }
  
}

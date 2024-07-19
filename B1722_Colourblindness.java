import java.util.Scanner;

public class B1722_Colourblindness
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(isSameColor(sc));
        }
    }

    public static String isSameColor(Scanner sc)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String r1 = sc.nextLine();
        String r2 = sc.nextLine();

        for(int i=0;i<n;i++)
        {
            if((r1.charAt(i)=='R' && r2.charAt(i)!='R') || (r1.charAt(i)!='R' && r2.charAt(i)=='R'))
                return "NO";
        }

        return "YES";
    }
  
}

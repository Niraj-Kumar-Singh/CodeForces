import java.util.Scanner;

public class A1985_CreatingWords
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

        String arr[] = s.split(" ");

        String s1 = arr[0];
        String s2 = arr[1];

        return s2.charAt(0)+s1.substring(1)+" "+s1.charAt(0)+s2.substring(1);
    }
  
}

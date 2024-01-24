import java.util.Scanner;

public class Contest161A_TrickyTemplate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
//        sc.nextLine();

        String ans[] = new String[t];
        for(int i=0;i<t;i++)
        {
            ans[i]=getAns(sc);
        }

        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }

    }

    public static String getAns(Scanner sc)
    {
        int n = sc.nextInt();
        sc.nextLine();

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();


        // 1. All 3 are UNEQUAL
        // 2. a & b are EQUAL but c is UNEUQAL

        for(int i=0;i<n;i++)
        {
            if((a.charAt(i)!=b.charAt(i) && a.charAt(i)!=c.charAt(i) && b.charAt(i)!=c.charAt(i)) || (a.charAt(i)==b.charAt(i) && a.charAt(i)!=c.charAt(i) && b.charAt(i)!=c.charAt(i)))
                return "YES";
        }


        return "NO";
    }
  
}

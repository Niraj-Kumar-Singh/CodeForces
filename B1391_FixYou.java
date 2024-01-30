import java.util.Scanner;

public class B1391_FixYou
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int ans[] = new int[t];
        for(int i=0;i<t;i++)
        {
            ans[i]=getMinWaysToFix(sc);
        }

        for(int x : ans)
            System.out.println(x);
    }

    public static int getMinWaysToFix(Scanner sc)
    {
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        int count=0;
//        String s[] = new String[r];
        String s="";

        for(int i=0;i<r;i++)
        {
            s = sc.nextLine();
            if(s.charAt(c-1)!='D')
                count++;
        }

        for(int i=0;i<c-1;i++)
        {
            if(s.charAt(i)!='R')
                count++;
        }

        return count-1;
    }
}

import java.util.Scanner;

public class A1389_LCMProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans[] = new String[t];

        int l=0, r=0;
        for(int i=0;i<t;i++)
        {
            l=sc.nextInt();
            r=sc.nextInt();

            ans[i]=getLCM(l, r);
        }

        for(String s : ans)
            System.out.println(s);
    }

    public  static String getLCM(int l, int r)
    {

        int x=l*2;
        if(x<=r)
            return l+" "+x;

        return -1+" "+(-1);

    }

}

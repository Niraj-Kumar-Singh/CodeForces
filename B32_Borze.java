import java.util.Scanner;

public class B32_Borze
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans="";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='-')
            {
                if(s.charAt(i+1)=='.')
                    ans+="1";
                else
                    ans+=2;

                i++;
            }
            else
                ans+="0";
        }

        System.out.println(ans);
    }

}

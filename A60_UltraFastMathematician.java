import java.util.Scanner;

public class A60_UltraFastMathematician
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String ans="";

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                ans+="0";
            else
                ans+="1";
        }


        System.out.println(ans);
    }
  
}

import java.util.Scanner;

public class A1097_GennadyAndACardGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str="";
        String ans="NO";
        for(int i=0;i<5;i++)
        {
            str=sc.next();

            if(s.charAt(0)==str.charAt(0) || s.charAt(1)==str.charAt(1))
                ans="YES";
        }

        System.out.println(ans);
    }
  
}

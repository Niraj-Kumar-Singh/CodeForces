import java.util.Scanner;

public class A514_ChewbacaAndNumber
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        String n = sc.nextLine();
//        StringBuilder n = new StringBuilder(s);

        for(int i=0;i<n.length();i++)
        {
            char c = n.charAt(i);
            int d = Integer.parseInt(c+"");
            if(9-d==0 && i==0)
                continue;
            if(9-d<d)
            {
                n=n.substring(0, i)+(9-d)+n.substring(i+1);
            }
        }

        System.out.println(n);
    }
  
}

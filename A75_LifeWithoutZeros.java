import java.util.Scanner;

public class A75_LifeWithoutZeros
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a0 = sc.nextLine();
        String b0 = sc.nextLine();

        String c0 = Integer.toString(Integer.parseInt(a0)+Integer.parseInt(b0));

        String a = "", b = "", c = "";

        for(int i=0;i<a0.length();i++)
        {
            if(a0.charAt(i)!='0')
                a+=a0.charAt(i);
        }


        for(int i=0;i<b0.length();i++)
        {
            if(b0.charAt(i)!='0')
                b+=b0.charAt(i);
        }


        for(int i=0;i<c0.length();i++)
        {
            if(c0.charAt(i)!='0')
                c+=c0.charAt(i);
        }

        if(Integer.parseInt(c)==Integer.parseInt(a)+Integer.parseInt(b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

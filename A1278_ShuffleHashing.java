import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1278_ShuffleHashing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String ans[] = new String[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getResult(sc);
        }

        for(String str : ans)
            System.out.println(str);

    }

    public static String getResult(Scanner sc)
    {
        String s = sc.nextLine();
        String h = sc.nextLine();

        if(h.length()<s.length())
            return "NO";

        int sl = s.length();
        int hl = h.length();

        s=sortString(s.toCharArray());

        for(int i=0;i+sl-1<hl;i++)
        {

            String str = sortString(h.substring(i, i+sl).toCharArray());

            if(s.equals(str))
                return "YES";
        }



        return "NO";

    }

    public static String sortString(char ch[])
    {
        Arrays.sort(ch);
        return new String(ch);
    }
  
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1473_StringLCM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
            getAns(sc);
        }
    }

    public static void getAns(Scanner sc)
    {
        String s = sc.nextLine();
        String t = sc.nextLine();

        if(s.length()==t.length())
        {
            if(s.equals(t))
                System.out.println(s);
            else
                System.out.println(-1);
            return;
        }

        if(s.length()>t.length())
        {
            if(areRelated(s, t))
                System.out.println(s+s);
            else
                System.out.println(-1);
        }
        else if(areRelated(t, s))
        {
            System.out.println(t+t);
        }
        else
            System.out.println(-1);
    }

    public static boolean areRelated(String s, String t)
    {

        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            sm.put(c, sm.getOrDefault(c, 0)+1);
        }

        for(int i=0;i<t.length();i++)
        {
            char c = t.charAt(i);

            tm.put(c, tm.getOrDefault(c, 0)+1);
        }

        if(sm.size()!=tm.size())
            return false;

        int s1 = sm.get(s.charAt(0));

        if(!tm.containsKey(s.charAt(0)))
            return false;

        int t1 = tm.get(s.charAt(0));

        if(s1%t1!=0)
            return false;

        int factor = s1/t1;

        for(Map.Entry<Character, Integer> entry : sm.entrySet())
        {
            char c = entry.getKey();
            int val = entry.getValue();

            if(tm.get(c)*factor!=val)
                return false;

        }

        return true;
    }
  
}

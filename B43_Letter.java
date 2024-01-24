import java.util.HashMap;
import java.util.Scanner;

public class B43_Letter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();


        String s2=sc.nextLine();

//        System.out.println(s1);
//        System.out.println(s2);

        HashMap<Character, Integer> hm= new HashMap<>();


        for(int i=0;i<s1.length();i++)
        {
            char c= s1.charAt(i);
            if(c==' ')
                continue;
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
        }

        boolean isPossible=true;
        for(int i=0;i<s2.length();i++)
        {
            char c = s2.charAt(i);

            if(c==' ')
                continue;

            if(hm.containsKey(c) && hm.get(c)>0)
                hm.put(c, hm.get(c)-1);
            else
            {
                isPossible = false;
                break;
            }
        }

        if(isPossible)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}

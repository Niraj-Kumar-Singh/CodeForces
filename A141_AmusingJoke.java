import java.util.HashMap;
import java.util.Scanner;

public class A141_AmusingJoke
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        String s3=sc.next();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s3.length();i++)
        {
            char c = s3.charAt(i);
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
        }

        boolean isPossible=true;
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);

            if(hm.containsKey(c))
            {
                if(hm.get(c)-1==0)
                    hm.remove(c);
                else
                    hm.put(c, hm.get(c)-1);
            }
            else
            {
                isPossible=false;
                break;
            }
        }

        if(isPossible)
        {
            for(int i=0;i<s2.length();i++)
            {
                char c = s2.charAt(i);

                if(hm.containsKey(c))
                {
                    if(hm.get(c)-1==0)
                        hm.remove(c);
                    else
                        hm.put(c, hm.get(c)-1);
                }
                else
                {
                    isPossible=false;
                    break;
                }
            }
        }



        if(hm.size()>0 || !isPossible)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
  
}

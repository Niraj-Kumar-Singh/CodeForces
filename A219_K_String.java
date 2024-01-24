import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A219_K_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
        }


        boolean isPossible = true;
        for(Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()%k!=0)
            {
                isPossible=false;
                break;
            }
        }


        if(isPossible)
        {
            String res = "";
            for(Map.Entry<Character, Integer> entry : hm.entrySet())
            {
                int n = entry.getValue()/k;
                String s1 = entry.getKey() + "";

                for(int i=0;i<n;i++)
                {
                    res+=s1;
                }
            }


            String ans="";

            while(k>0)
            {
                ans+=res;
                k--;
            }

            System.out.println(ans);

        }
        else
            System.out.println(-1);
    }
  
}

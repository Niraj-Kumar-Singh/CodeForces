import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B276_LittleGirlandGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

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

        int oddCount=0;

        for(Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()%2!=0)
                oddCount++;
        }

        if(oddCount==0)
            System.out.println("First");
        else
        {
            if((oddCount-1)%2==0)
                System.out.println("First");
            else
                System.out.println("Second");
        }

    }
  
}

import java.util.HashMap;
import java.util.Scanner;

public class A205_LittleElephantAndRozdil
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min=Integer.MAX_VALUE;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();

            if(hm.containsKey(x))
                hm.put(x, -1);
            else
                hm.put(x, i+1);
            
            min = Math.min(x, min);

        }

        if(hm.get(min)==-1)
            System.out.println("Still Rozdil");
        else
            System.out.println(hm.get(min));
    }
  
}

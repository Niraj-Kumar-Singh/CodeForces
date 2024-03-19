import java.util.HashMap;
import java.util.Scanner;

public class C4_RegistrationSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();

            if(hm.containsKey(s))
            {
                int v = hm.get(s);
                hm.put(s, v+1);
                System.out.println(s+v);
            }
            else
            {
                hm.put(s, 1);
                System.out.println("OK");
            }
        }
    }
  
}

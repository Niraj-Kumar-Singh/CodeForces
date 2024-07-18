import java.util.HashSet;
import java.util.Scanner;

public class B1742_Increasing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(isIncreasing(sc));
        }
    }

    public static String isIncreasing(Scanner sc)
    {
        int n = sc.nextInt();
        boolean valid=true;
        int x = 0;

        HashSet<Integer> hs = new HashSet<>();
        while(n-->0)
        {
            x = sc.nextInt();
            
            if(hs.contains(x))
                valid=false;

            hs.add(x);
        }

        return valid ? "YES" : "NO";
    }
  
}

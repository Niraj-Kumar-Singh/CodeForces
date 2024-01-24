import java.util.HashSet;
import java.util.Scanner;

public class A27_NextTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int min = 1;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            hs.add(sc.nextInt());
        }


        while(hs.contains(min))
            min++;

        System.out.println(min);
    }
  
}

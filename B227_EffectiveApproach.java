import java.util.HashMap;
import java.util.Scanner;

public class B227_EffectiveApproach
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        HashMap<Integer, Integer> hm =new HashMap<>();

        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            hm.put(x, i);
        }

        int m = sc.nextInt();

        long vasya=0;
        long petya=0;

        for(int i=0;i<m;i++)
        {
            int num =sc.nextInt();
            int index=hm.get(num);

            vasya+=index;
            petya+=(n-index+1);
        }

        System.out.println(vasya+" "+petya);
    }
}

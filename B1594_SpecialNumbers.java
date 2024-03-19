import java.util.ArrayList;
import java.util.Scanner;

public class B1594_SpecialNumbers
{
    static int MOD = 1000000007;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println(getAns(sc));
        }
    }

    public static long getAns(Scanner sc)
    {

        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n==2)
            return k;

        ArrayList<Integer> list = new ArrayList<>();
//        int t = n;
        while(k!=0)
        {
            int d = k%2;
            list.add(d);
            k/=2;

        }

//        System.out.println(list);
        long ans = 0;
        int p = list.size()-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0)
                continue;
            int  curr = (int)power(n, i);
            ans=(ans+curr);
        }

        return ans%MOD;


    }

    public static int power(long n, int p)
    {
        long ans=1;

        while(p>0)
        {
            int lastBit = p&1;

            if(lastBit>0)
            {
                ans=(ans*n)%MOD;
            }

            n=(n*n)%MOD;

            p=p>>1;
        }

//        long ans=1;
//        while(p>0)
//        {
//            ans=(ans*n)%MOD;
//            p--;
//        }

        return (int)(ans%MOD);
    }
  
}

import java.util.ArrayList;
import java.util.Scanner;

public class A1373_DonutShops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>(2*t);

        for(int i=0;i<t;i++)
        {
            getDonuts(sc, list);
        }

        for(int i=0;i<2*t;i+=2)
        {
            System.out.println(list.get(i)+" "+list.get(i+1));
        }

    }

    public static void getDonuts(Scanner sc, ArrayList<Long> list)
    {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a<c)
            list.add((long)1);
        else
            list.add((long)-1);

        if(a*b<=c)
        {
            list.add((long)-1);
        }
        else
        {
            list.add(b);
        }

    }
  
}

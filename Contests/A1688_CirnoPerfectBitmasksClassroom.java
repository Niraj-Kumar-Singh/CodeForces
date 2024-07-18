import java.math.BigInteger;
import java.util.Scanner;

public class A1688_CirnoPerfectBitmasksClassroom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static BigInteger getAns(Scanner sc)
    {
        BigInteger n = new BigInteger(sc.nextLine());
        BigInteger t = n;

        if(n.equals(new BigInteger("1")))
            return new BigInteger("3");

        int x = t.bitLength();
        int sb = t.getLowestSetBit();
//        System.out.println(sb);

        if(x==sb+1)
            return n.add(new BigInteger("1"));

        BigInteger ans = new BigInteger(String.valueOf(1<<(sb)));


        return ans;

    }
  
}

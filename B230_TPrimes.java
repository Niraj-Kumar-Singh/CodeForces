import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B230_TPrimes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }

        boolean[] p=new boolean[1000001];

        p[0]=false;
        p[1]=false;
        p[2]=true;


        // Making all the odd true i.e. potential prime numbers
        for(int i=3;i<p.length;i+=2)
        {
            p[i]=true;
        }


        // Making all the odd multiples of odd numbers "false" i.e. removing them from potential prime category
        for(int i=3;i<p.length;i+=2)
        {
            if(p[i])
            {
                for(int j=3*i;j<p.length;j+=2*i)
                {
                    p[j]=false;
                }
            }
        }

        HashSet<Long> hs = new HashSet<>();
        hs.add(4L);
        for(int i=3;i<p.length;i+=2)
        {
            if(p[i])
                hs.add((long)i*i);
        }

        for(int i=0;i<n;i++)
        {
            if(hs.contains(arr[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }




    }


}

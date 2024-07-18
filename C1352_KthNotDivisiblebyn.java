import java.util.Scanner;

public class C1352_KthNotDivisiblebyn
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getKthElement(sc));
        }
    }

    public static int getKthElement(Scanner sc)
    {
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k<n)
            return k;

//        int count=n;
//        for(int i=n+1;i<Integer.MAX_VALUE;i+=n)
//        {
//            int startCount = i-(i/n);
//            int endCount = startCount+n-2;
//
//            if(startCount<=k &&  k<=endCount)
//                return i+k-startCount;
//
//        }

        int ans = k + ((k-1)/(n-1));

        return ans;
    }
  
}

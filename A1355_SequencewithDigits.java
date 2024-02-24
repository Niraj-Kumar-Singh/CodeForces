import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1355_SequencewithDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long a=0, k=0;

        for(int i=0;i<t;i++)
        {
            a=sc.nextLong();
            k=sc.nextLong();
            System.out.println(getAns(a, k));
        }
    }

    public static long getAns(long a, long k)
    {
        for(int i=2;i<=k;i++)
        {
            int arr[] = getMinMax(a);
            int min=arr[0];
            int max=arr[1];

            if(min==0)
                break;

            a=a+(min*max);
        }

        return a;
    }

    public static int[] getMinMax(long n)
    {
        int min=9, max=0;

        while(n>0)
        {
            int d = (int)n%10;
            min=Math.min(min, d);
            max=Math.max(max, d);

            n=n/10;
        }

        return new int[]{min, max};






//        String s = Long.toString(n);
//        List<Integer> digits = new ArrayList<>();
//
//        // Convert string to a list of integers
//        for (char c : s.toCharArray()) {
//            digits.add(Character.getNumericValue(c));
//        }
//
//        // Find the smallest and largest digits using the accumulate function
//        int smallest = digits.stream().reduce(digits.get(0), Integer::min);
//        int largest = digits.stream().reduce(digits.get(0), Integer::max);
//
//        return new int[]{smallest, largest};
    }
  
}

import java.util.ArrayList;
import java.util.Scanner;

public class B460_LittleDimaAndEquation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Long> ans = new ArrayList<>();

        long arr[] = new long[82];

        for(int i=1;i<82;i++)
        {
            arr[i]= (b*(long)(Math.pow(i, a)))+c;

            if(getSum(Long.toString(arr[i]))==i && arr[i]>0 && arr[i]<1000000000)
                ans.add(arr[i]);
        }

        System.out.println(ans.size());

        for (long x : ans)
            System.out.println(x);


    }

    public static int getSum(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=s.charAt(i)-'0';
        }

        return sum;
    }
  
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Contest919_A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long arr[] = new long[t];

        for(int i=0;i<t;i++)
        {
            arr[i]=getNumbers(sc);
        }

        for(int i=0;i<t;i++)
        {
            System.out.println(arr[i]);
        }



    }

    public static long getNumbers(Scanner sc)
    {
        int n = sc.nextInt();

        int end=Integer.MAX_VALUE, start=0;
        int a=0, x=0;
//        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> hs = new ArrayList<>();




        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            x=sc.nextInt();

            if(a==1)
            {
                start=Math.max(start, x);
            }
            else if(a==2)
            {
               end=Math.min(end, x);
            }
            else
                hs.add(x);
        }

//        System.out.println("Start="+start+" end="+end);

        long count=end-start+1;

        for(int y : hs)
        {
            if(start<=y && y<=end)
                count--;
        }


        return Math.max(count, 0);
    }
  
}

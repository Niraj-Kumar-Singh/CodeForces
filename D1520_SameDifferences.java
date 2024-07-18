import java.util.HashMap;
import java.util.Scanner;

public class D1520_SameDifferences
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static long getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];

        HashMap<Integer, Integer> hm = new HashMap<>();
        long res=0;
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
            int x = arr[i]-i;
            res+=hm.getOrDefault(x, 0);

            hm.put(x, hm.getOrDefault(x, 0)+1);
        }


        return res;
    }
  
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A296_YaroslavandPermutations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            if(hm.containsKey(x))
            {
                hm.put(x, hm.get(x)+1);
            }
            else
            {
                hm.put(x, 1);
            }
        }


        int arr[] = new int[hm.size()];
        int j=0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            arr[j++]=entry.getValue();
        }

        Arrays.sort(arr);

        if(arr.length==1)
        {
            if(arr[0]<=1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
        {
            boolean isPossible = true;

            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]-arr[i-1]>1)
                    isPossible=false;
                else
                    isPossible=true;

                arr[i]+=arr[i-1];
            }

            if(isPossible)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
  
}

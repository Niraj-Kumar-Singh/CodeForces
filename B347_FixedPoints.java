import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B347_FixedPoints
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        int arr[]= new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean isSwapped = false;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

            if(i==arr[i])
                count++;
            else
                hm.put(arr[i], i);
        }


        int extraCount=0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            int key = entry.getKey();
            int val = entry.getValue();
            int currCount=0;
            if(hm.containsKey(val))
            {
                currCount++;

                if(hm.get(val)==key)
                    currCount++;

            }

            extraCount=Math.max(currCount, extraCount);

            if(extraCount==2)
                break;
        }


        System.out.println(count+extraCount);

    }
  
}

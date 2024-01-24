import java.util.Arrays;
import java.util.HashMap;

public class Meesho_Q4_PuzzleGameEscape
{
    public static void main(String[] args)
    {
//        int arr[] = {5,6,6,4,11};
//        System.out.println(getMaxPoints(arr));

//        int arr[] = {3, 4, 2};
//        System.out.println(getMaxPoints(arr));

        int arr[] = {1,2,1,3,2,3};
        System.out.println(getMaxPoints(arr));

    }

    public static long getMaxPoints(int arr[])
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x : arr)
        {
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }

        Arrays.sort(arr);
        long countPoints=0;
        for(int i = arr.length-1;i>=0;i--)
        {
            if(!hm.containsKey(arr[i]))
                continue;

            int val = hm.get(arr[i]);
            countPoints+=arr[i]*val;

            if(hm.containsKey(arr[i]-1))
                hm.remove(arr[i]-1);

            if(hm.containsKey(arr[i]+1))
                hm.remove(arr[i]+1);

            hm.remove(arr[i]);
        }

        return countPoints;
    }
  
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A455_Boredom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int x=0;
        int maxIndex=0;

        for(int i=0;i<n;i++)
        {
           x  =sc.nextInt();
           maxIndex=Math.max(maxIndex, x);

           hm.put(x, hm.getOrDefault(x, 0)+1);

        }


        int arr[] = new int[maxIndex+1];
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            int k = entry.getKey();
            int v = entry.getValue();

            arr[k]=v;
        }


        long points[] = new long[maxIndex+1];

        for(int i=1;i<arr.length;i++)
        {
            points[i]=(long)i*arr[i];

            if(i-2>=0)
            {
                points[i]+=points[i-2];
            }

            if(points[i-1]>points[i])
            {
                points[i]=points[i-1];
            }
        }

        System.out.println(points[arr.length-1]);


    }


  
}

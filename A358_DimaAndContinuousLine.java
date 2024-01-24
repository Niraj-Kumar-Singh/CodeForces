import java.util.*;

public class A358_DimaAndContinuousLine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        ArrayList<Integer[]> list = new ArrayList<>();
        boolean noIntersect=true;

        for(int i=0;i<n-1;i++)
        {
            int currMax = Math.max(arr[i], arr[i+1]);
            int currMin = Math.min(arr[i], arr[i+1]);

            for(Integer[] a : list)
            {
                int k= a[0];
                int v = a[1];

                if(currMax<=k || (k<=currMin && currMax<=v) || v<=currMin || (currMin<=k && v<=currMax))
                {

                }
                else
                {
                    noIntersect=false;
                    break;
                }
            }

            list.add(new Integer[]{currMin, currMax});

            if(!noIntersect)
                break;
        }

        if(noIntersect)
            System.out.println("no");
        else
            System.out.println("yes");

    }
  
}

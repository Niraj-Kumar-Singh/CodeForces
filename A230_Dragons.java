import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A230_Dragons
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        }); // End of function call sort().

//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arr[i][0]+" "+arr[i][1]);
//        }

        for (int i=0;i<n;i++)
        {
            int dragonS = arr[i][0];
            int bonus = arr[i][1];

            if(s>dragonS)
            {
                s+=bonus;
            }
            else
            {
                s=-1;
                System.out.println("NO");
                break;
            }
        }

        if(s!=-1)
            System.out.println("YES");
    }
  
}

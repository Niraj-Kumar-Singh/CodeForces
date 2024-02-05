import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A1237_BalancedRatingChanges
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int arr[][] = new int[n][2];

        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return -1;
                } else if (o1[0] > o2[0]) {
                    return 1;
                } else {
                    // If values are equal, compare the indices (o1[1] and o2[1])
                    return Integer.compare(o1[1], o2[1]);
                }
            }
        });


        int sum = 0;
        for(int i=0;i<n;i++)
        {
            float x = (float)Math.ceil(((float)arr[i][0]/2));

            arr[i][0]=(int)x;

            sum+=x;


        }

        int i = 0;
        while(sum>0 && i<n)
        {
            if(nums[arr[i][1]]%2!=0)
            {
                arr[i][0]--;
                sum--;
            }
            i++;
        }

        for(i=0;i<n;i++)
        {
            nums[arr[i][1]]=arr[i][0];
        }


//        System.out.println(Arrays.toString(nums));
        for(int x : nums)
            System.out.println(x);


    }
  
}

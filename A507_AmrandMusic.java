import java.util.*;

public class A507_AmrandMusic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=i+1;
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


        int index=0;

        while(index<n && k-arr[index][0]>=0)
        {
            k-=arr[index][0];
            index++;
        }

        System.out.println(index);

        for(int i=0;i<index;i++)
        {
            System.out.println(arr[i][1]);
        }

    }
  
}

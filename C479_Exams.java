import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C479_Exams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long arr[][] = new long[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextLong();
            arr[i][1]=sc.nextLong();
        }

        Arrays.sort(arr, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[0]==o2[0])
                    return Long.compare(o1[1], o2[1]);

                return Long.compare(o1[0], o2[0]);
            }
        });



        long maxDay=0;
        boolean isAscending=true;

        for(int i=0;i<n;i++)
        {
            if(maxDay<=arr[i][1])
                maxDay=arr[i][1];
            else
                maxDay=arr[i][0];
        }




        System.out.println(maxDay);


    }
  
}

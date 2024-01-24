import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A166_RankList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if((o1[0]<o2[0]) || (o1[0]==o2[0] && o1[1]>o2[1]))
                    return 1;
                else
                    return -1;


            }
        });


//        display(arr);

        int index=k-1;
//        System.out.println("index="+index);

        int start=index, end=index;


        while(start>0 && arr[start-1][0]==arr[index][0] && arr[start-1][1]==arr[index][1])
            start--;

        while(end<n-1 && arr[end+1][0]==arr[index][0] && arr[end+1][1]==arr[index][1])
            end++;

//        System.out.println("start="+start+" end="+end);

        System.out.println(end-start+1);
    }



    public static void display(int arr[][])
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

  
}

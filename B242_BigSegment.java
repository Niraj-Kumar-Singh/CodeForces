import java.util.HashMap;
import java.util.Scanner;

public class B242_BigSegment
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            int currMin = sc.nextInt();
            int currMax = sc.nextInt();

            min=Math.min(min, currMin);
            max=Math.max(max, currMax);

            arr[i][0]=currMin;
            arr[i][1]=currMax;



        }

        int index=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i][0]==min && arr[i][1]==max)
            {
                index=i+1;
                break;
            }
        }

        System.out.println(index);


    }
  
}

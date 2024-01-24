import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A300_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        negative.add(arr[0]);
        int x = 0;
        for(int i=1;i<n;i++)
        {

            x=arr[i];
            if(x==0)
                zero.add(arr[i]);
            else if(x<0)
            {
                if(arr[i+1]<0)
                {
                    positive.add(arr[i++]);
                    positive.add(arr[i]);
                }
                else
                {
                    zero.add(arr[i]);
                }
            }
            else
                positive.add(arr[i]);
        }

        System.out.print(negative.size() + " " + negative.get(0));
        for(int i=1;i<negative.size();i++)
            System.out.print(" " + negative.get(i));

        System.out.println();

        System.out.print(positive.size() + " " + (positive.size()>0 ? positive.get(0) : 0));
        for(int i=1;i<positive.size();i++)
            System.out.print(" " + positive.get(i));

        System.out.println();

        System.out.print(zero.size() + " " + zero.get(0));
        for(int i=1;i<zero.size();i++)
            System.out.print(" " + zero.get(i));



    }
  
}

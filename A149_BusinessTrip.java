import java.util.Arrays;
import java.util.Scanner;

public class A149_BusinessTrip
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int arr[] = new int[12];
        for(int i=0;i<12;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int i = 11;
//        int count=0;
        while(k>0 && i>=0)
        {
            k-=arr[i--];

        }

        if(k>0)
            System.out.println(-1);
        else
            System.out.println(11-i);
    }
  
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A456_Laptops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100001];

        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[sc.nextInt()]=sc.nextInt();
        }

        int max=0;
        boolean isPresent=false;
        for(int i=1;i<=100000;i++)
        {
            if(arr[i]==0)
                continue;

            if(arr[i]<max && max>0)
            {
                isPresent = true;
                break;
            }

            max=Math.max(max, arr[i]);
        }

        if(isPresent)
            System.out.println("Happy Alex");
        else
            System.out.println("Poor Alex");
    }
}

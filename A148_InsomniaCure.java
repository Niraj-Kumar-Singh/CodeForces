import java.util.Arrays;
import java.util.Scanner;

public class A148_InsomniaCure
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[]=new int[4];

        for(int i=0;i<4;i++)
            arr[i]=sc.nextInt();

        int n = sc.nextInt();
        boolean a[] = new boolean[n+1];

        for(int i=0;i<n+1;i++)
            a[i]=true;

        for(int j=0;j<4;j++)
        {
            for(int i=arr[j];i<n+1;i+=arr[j])
            {
                a[i]=false;
            }
        }

        int count=0;

        for(int i=1;i<n+1;i++)
        {
            if(a[i])
                count++;


        }


        System.out.println(n-count);
    }
  
}

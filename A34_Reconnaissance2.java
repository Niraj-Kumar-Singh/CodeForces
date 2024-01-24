import java.util.Scanner;

public class A34_Reconnaissance2
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int fIndex=1;
        int sIndex=2;
        int min=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(arr[i]-arr[(i+1)%n]);

            if(diff<=min)
            {
                min=diff;
                fIndex=i+1;
                sIndex=(i+1)%n+1;
            }
        }

//
        System.out.println(fIndex + " " + sIndex);
    }
}

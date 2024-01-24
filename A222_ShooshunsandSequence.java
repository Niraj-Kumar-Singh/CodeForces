import java.util.Scanner;

public class A222_ShooshunsandSequence
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        boolean isPossible=true;
        for(int i=k-1;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                isPossible=false;
                break;
            }
        }

        if(isPossible)
            System.out.println(k-1);
        else
            System.out.println(-1);
    }
}

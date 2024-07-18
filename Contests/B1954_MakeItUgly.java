import java.util.Scanner;

public class B1954_MakeItUgly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static int getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n-1;i++)
        {
//            if(arr[i-1]==arr[i+1] && arr[i-1]!=arr[i])
//                Math.min()
        }



        return -1;


    }
  
}

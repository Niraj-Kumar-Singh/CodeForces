import java.util.Scanner;

public class Contest1933B_TurtleMathFastThreeTask
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println(getAns(sc));
        }
    }

    public static int getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int sum = 0;

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        int moves = 0;
        if(sum%3==0)
            return moves;

        moves+=3-sum%3;

        for(int x : arr)
        {
            if((sum-x)%3==0)
                return 1;
        }
        return moves;
    }
  
}

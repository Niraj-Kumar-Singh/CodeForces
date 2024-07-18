import java.util.Scanner;

public class B1985_MaximumMultipleSum
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

        int sum=0;
        int num=2;

        for(int i=2;i<=n;i++)
        {
            int j=1;

            int currSum=0;

            while(i*j<=n)
            {
                currSum+=i*j;
                j++;
            }

            if(currSum>sum)
            {
                sum=currSum;
                num=i;
            }


        }

        return num;
    }
  
}

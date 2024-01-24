import java.util.Arrays;
import java.util.Scanner;

public class B271_PrimeMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        int max=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                max=Math.max(max, arr[i][j]);
            }
        }

        int prime[] = new int[max+100];
        getPrime(prime);

//        System.out.println(Arrays.toString(prime));

        int rows[] = new int[n];
        int cols[] = new int[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int x=countStepsToPrime(prime, arr[i][j]);
                rows[i]+=x;
                cols[j]+=x;
            }
        }

//        System.out.println(Arrays.toString(rows));
//        System.out.println(Arrays.toString(cols));

        int steps=Integer.MAX_VALUE;
        for(int x : rows)
            steps=Math.min(x, steps);

        for(int x : cols)
            steps=Math.min(x, steps);

        System.out.println(steps);
    }

    public static void getPrime(int prime[])
    {
        Arrays.fill(prime, 1);
        prime[0]=0;
        prime[1]=0;
        int n = prime.length;

        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==1)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    prime[j]=0;
                }
            }
        }
    }

    public static int countStepsToPrime(int prime[], int n)
    {
        if(prime[n]==1)
            return 0;

        int i=n;
        while(prime[i]!=1)
        {
            i++;
        }

        return i-n;
    }
  
}

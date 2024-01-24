import java.util.Scanner;

public class E166_Tetrahedron
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int MOD = 1000000007;

        long dp[][]=new long[2][n+1];

        dp[1][0]=1;
        dp[0][0]=0;


        for(int j=1;j<=n;j++)
        {
            dp[1][j]=3*dp[0][j-1]%MOD;
            dp[0][j]=(2*dp[0][j-1]+dp[1][j-1])%MOD;
        }


        System.out.println(dp[1][n]);
    }
  
}

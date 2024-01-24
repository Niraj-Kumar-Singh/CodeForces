import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contest161B_FormingTriangles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long ans []= new long[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getAns(sc);
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }
    }

    public static long getAns(Scanner sc)
    {
        int n = sc.nextInt();

        int count=0;
        int sides[] = new int[n+1];
        int x=0;
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            sides[x]++;
        }

        long ans=0;
        for(int i=0;i<=n;i++)
        {
            ans+=((long)sides[i]*(sides[i]-1)/2)*count;
            ans+=((long)sides[i]*(sides[i]-1) * (sides[i]-2))/6;
            count+=sides[i];
        }


        return ans;
    }
  
}

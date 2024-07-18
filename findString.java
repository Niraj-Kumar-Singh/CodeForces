import java.util.*;
public class findString
{

    public static void main(String[] args)
    {
        int X[] = {53, 250, 5, 531, 302, 773};

        System.out.println(calculateMinCost(1000, 6, 342, 231, X));


    }


    public static int calculateMinCost(int N, int Q, int A, int B, int [] X)
    {
        int ans=0;

        for(int k : X)
        {
            int m = Math.abs(A-k);
            int n = Math.abs(B-k);
            if(m<n)
            {
                A=k;
                ans+=m;
            }
            else
            {
                B=k;
                ans+=n;
            }
        }

        return ans;
    }
  
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_DoubleModularExponentiation
{
    public static void main(String[] args)
    {
//        int arr[][] = new int[][]{{30,5,43,2},{15,50,35,41},{45,34,41,32},{14,37,33,13},{6,8,1,53},{37,1,12,52},{42,37,2,52},{9,2,15,3},{31,12,21,24},{52,24,6,12},{51,35,21,52},{30,18,10,2},{27,31,50,27},{29,25,26,32},{15,38,43,17},{22,12,16,43},{48,9,15,6},{41,26,22,21},{41,49,52,26},{53,38,9,33}};
//        int k = 1;

        int arr[][] = new int[][]{{2,3,3,10},{3,3,3,1},{6,1,1,4}};
        int k = 2;

        System.out.println(getGoodIndices(arr, k));

//        double x =Math.pow(31, 12);
//        System.out.println(Math.pow(31, 12)%10);
//        System.out.println(power(1, 21, 24));
    }

    public static List<Integer> getGoodIndices(int[][] variables, int target)
    {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<variables.length;i++)
        {
            int a=variables[i][0];
            int b=variables[i][1];
            int c=variables[i][2];
            int m=variables[i][3];


//             31,12,21,24
             int x = (power(a, b, 10));
             int y = power(x, c, m);

            if(y==target)
            {
                list.add(i);
//                System.out.println(Arrays.toString(variables[i]));
            }
        }

        return list;

    }


    public static int power(int n, int p, int mod)
    {
        int x=n;
        for(int i=1;i<p;i++)
        {
            x=(x*n)%mod;
        }
        return x%mod;
    }
  
}



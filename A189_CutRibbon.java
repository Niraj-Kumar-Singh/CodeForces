import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


// DP problem
public class A189_CutRibbon
{
    public static  HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(countRibbons(n, a, b, c));



    }

    public static int countRibbons(int n, int a, int b, int c)
    {

        if(n==0)
            return 0;

        if(n<0)
            return Integer.MIN_VALUE;


        /************ For smaller values of 'n' this will be sufficient, but for bigger value, we need to do memoization
          
           return 1+Math.max(countRibbons(n-a, a, b, c), Math.max(countRibbons(n-b, a, b, c), countRibbons(n-c, a, b, c)) );

         *********/

        if(hm.containsKey(n))  // If the value for the key->n already exists, no need to calculate it
            return hm.get(n);




        // if the value for key->n doesn't exist, then calculate it, and
        int val = 1+Math.max(countRibbons(n-a, a, b, c), Math.max(countRibbons(n-b, a, b, c), countRibbons(n-c, a, b, c)) );
        hm.put(n, val);  // then put it inside the hashmap for future possible use

        return val;  // return the value calculated.



    }
  
}

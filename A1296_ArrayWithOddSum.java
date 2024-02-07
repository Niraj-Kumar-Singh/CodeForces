import java.util.Scanner;

public class A1296_ArrayWithOddSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans[] = new String[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getAns(sc);
        }
        for(String s : ans)
            System.out.println(s);
    }

    public static String getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x= 0;
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            if(x%2==0)
                countEven++;
            else
                countOdd++;
        }



        return (countEven==0 && countOdd%2==0) || (countOdd==0) ?  "NO" :"YES" ;
    }
  
}

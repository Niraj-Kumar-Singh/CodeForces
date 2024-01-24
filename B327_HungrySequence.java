import java.util.Arrays;
import java.util.Scanner;

public class B327_HungrySequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 10000000;
        String ans = "";
        for(int i=m-n+1;i<=m;i++)
            ans+=i+" ";

        System.out.println(ans);
    }


  
}

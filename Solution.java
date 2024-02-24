import java.util.Scanner;

public class Solution{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int t = x;
        x=y;
        y=t;

        System.out.println(x+" "+y);

    }
}







//    int n = sc.nextInt();
//        int x=0;
//        int ans=1;
//
//        for(int i=0;i<n;i++)
//        {
//            x=sc.nextInt();
//            if(x%2==0)
//            {
//                ans=ans*x;
//            }
//        }
//
//        System.out.println(ans);
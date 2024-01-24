import java.util.Scanner;

public class A248_Cupboards
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int left[]=new int[n];
//        int right[]=new int[n];

        int leftOpen=0;
        int rightOpen=0;

        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();

            if(l==1)
                leftOpen++;

            if(r==1)
                rightOpen++;
        }

        int left=Math.min(leftOpen, n-leftOpen);
        int right=Math.min(rightOpen, n-rightOpen);

        System.out.println(left+right);
    }
  
}

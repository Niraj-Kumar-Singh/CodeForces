import java.util.Scanner;

public class A361_LevkoAndTable
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

//        int arr[][] = new int[n][n];
//
//        int sum[] = new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((i==j?k:0)+ " ");
            }
            System.out.println();
        }


    }
  
}

import java.util.Arrays;
import java.util.Scanner;

public class A275_LightsOut
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int ans[][]=new int[3][3];

        for(int []row:ans)
            Arrays.fill(row, 1);


//        for (int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.print(ans[i][j]);
//            }
//            System.out.println();
//        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int x = arr[i][j];
                if(j==0 && x%2!=0)
                {
//                    System.out.println("i="+i + " j="+j);
                    ans[i][j]=1-ans[i][j];
                    ans[i][j+1]= 1-ans[i][j+1];
                    if(i==0)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                    }
                    else if(i==1)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                    else if(i==2)
                    {
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                }
                else if(j==1 && x%2!=0)
                {
//                    System.out.println("i="+i + " j="+j);
                    ans[i][j-1]=1-ans[i][j-1];
                    ans[i][j]=1-ans[i][j];
                    ans[i][j+1]= 1-ans[i][j+1];

                    if(i==0)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                    }
                    else if(i==1)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                    else if(i==2)
                    {
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                }
                else if(j==2 && x%2!=0)
                {
//                    System.out.println("i="+i + " j="+j);
                    ans[i][j-1]=1-ans[i][j-1];
                    ans[i][j]=1-ans[i][j];

                    if(i==0)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                    }
                    else if(i==1)
                    {
                        ans[i+1][j]=1-ans[i+1][j];
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                    else if(i==2)
                    {
                        ans[i-1][j]=1-ans[i-1][j];
                    }
                }
            }
        }

        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }




    }
  
}

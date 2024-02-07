import java.util.Scanner;

public class B486_ORinMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int brr[][] = new int[m][n];

        if(isValid(arr, m, n, brr)) {
            System.out.println("YES");

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(brr[i][j]+" ");
                }

                System.out.println();
            }
        }
        else
            System.out.println("NO");


    }

    public static boolean isValid(int arr[][], int m, int n, int brr[][])
    {
//        if(m==1 && n==1)
//            return true;

        if(m==1)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[0][j]!=arr[0][j+1])
                    return false;

            }
            brr[0][0]=arr[0][0];
        }
        else if(n==1)
        {
            for(int i=0;i<n-1;i++)
            {
                if(arr[i][0]!=arr[i+1][0])
                    return false;

            }
            brr[0][0]=arr[0][0];
        }
        else
        {

            boolean crossFound = false;
            boolean onePresent = false;

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]==1)
                    {
                        onePresent=true;
                        boolean colOne = true;
                        for(int r=0;r<m;r++)
                        {
                            if(i!=r && arr[r][j]==0)
                            {
                                colOne=false;
                                break;
                            }
                        }


                        boolean rowOne=true;
                        for(int c=0;c<n;c++)
                        {
                            if(j!=c && arr[i][c]==0)
                            {
                                rowOne=false;
                                break;
                            }
                        }



                        if(!rowOne && !colOne)
                            return false;

                        if(rowOne && colOne)
                        {
                            brr[i][j]=1;
                            crossFound=true;
                        }
                    }
                }
            }


            if(onePresent)
                return crossFound;

        }


        return true;
    }
  
}

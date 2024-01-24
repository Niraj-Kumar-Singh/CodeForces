import java.util.Arrays;
import java.util.Scanner;

public class A445_DZYChessman
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m = sc.nextInt();

        char arr[][]=new char[n][m];

        for(int i=0;i<n;i++)
        {
            String s = sc.next();
//            System.out.println(s);
            arr[i]=s.toCharArray();
        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        char last = 'B';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]=='.')
                {
                    arr[i][j]=last;
//                    if(last=='W')
//                    {
//                        arr[i][j]='B';
//                        last='B';
//                    }
//                    else
//                    {
//                        arr[i][j]='W';
//                        last='W';
//                    }
                }

                if(last=='B')
                    last='W';
                else
                    last='B';

            }

            if(last=='B')
                last='W';
            else
                last='B';


        }
//        System.out.println("clear");

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
  
}

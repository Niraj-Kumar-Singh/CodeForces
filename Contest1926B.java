import java.util.Arrays;
import java.util.Scanner;

public class Contest1926B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for(int i=0;i<t;i++)
        {
            printAns(sc);
        }
    }

    public static void printAns(Scanner sc)
    {
//        System.out.println("Start");
        int n = sc.nextInt();
        sc.nextLine();
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();

            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.charAt(j)-'0';
            }
//            System.out.println(Arrays.toString(arr[i]));
        }

//        for(int i=0;i<n;i++)
//        {
//
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int i=0;i<n;i++)
        {
            boolean hasOne=false;
            int count1=0;
            int index=-1;

            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    count1++;
                    if(!hasOne)
                    {
                        hasOne=true;
                        index=j;
                    }
                }
            }

            if(hasOne)
            {
//                System.out.println("count="+count1+" index="+index);

                if(i+count1-1<n && count1>1 && arr[i+count1-1][index]==1)
                    System.out.println("SQUARE");
                else
                    System.out.println("TRIANGLE");


//                if(index+count1-1<n && count1>1)
//                {
//                    if(arr[index+count1-1][index]==1 && arr[index])
//                }
//                    System.out.println("SQUARE");
//                else
//                    System.out.println("TRIANGLE");

                break;
            }
        }
    }
}

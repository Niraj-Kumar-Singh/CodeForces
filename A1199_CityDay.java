import java.util.Scanner;

public class A1199_CityDay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int minIndex=0;
        for(int i=0;i<n;i++)
        {
            boolean skip=false;
            for(int j=1;j<=x && i-j>=0;j++)
            {
                if(arr[i-j]<=arr[i])
                {
                    skip=true;
                    break;
                }
            }

            if(skip)
                continue;

            for(int j=1;j<=y && i+j<n;j++)
            {
                if(arr[i+j]<=arr[i])
                {
                    skip=true;
                    break;
                }
            }

            if(skip)
                continue;

            System.out.println(i+1);
                break;
        }


//        int minEndIndex=1;
//        for(int i=2;i<=y && i<n;i++)
//        {
//            if(arr[i]<arr[minEndIndex])
//                minEndIndex=i;
//        }
//
//        if(arr[0]>=arr[minEndIndex])
//        {
//            int minStartIndex=0;
//
//            for(int i=1;i<n;i++)
//            {
//
//            }
//        }
//        else
//            System.out.println(1);
    }
  
}

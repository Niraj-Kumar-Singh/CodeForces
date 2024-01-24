import java.util.Scanner;

public class A122_LuckyDivision
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[11];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 47;
        arr[3] = 74;
        arr[4] = 444;
        arr[5] = 447;
        arr[6] = 474;
        arr[7] = 477;
        arr[8] = 744;
        arr[9] = 747;
        arr[10] = 777;

        boolean isLucky = false;
        for(int i=0;i<arr.length && arr[i]<=n;i++)
        {
            if(n%arr[i]==0)
            {
                System.out.println("YES");
                isLucky=true;
                break;
            }
        }


        if(!isLucky)
            System.out.println("NO");
    }

}

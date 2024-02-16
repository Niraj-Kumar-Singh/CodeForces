import java.util.Scanner;

public class A1927_MakeitWhite
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int arr[] = new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=getMinSegment(sc);
        }

        for(int x : arr)
            System.out.println(x);
    }

    public static int getMinSegment(Scanner sc)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int i =0;
        for(;i<n;i++)
        {
            if(s.charAt(i)=='B')
                break;
        }
        int j=n-1;
        for(;j>i;j--)
        {
            if(s.charAt(j)=='B')
                break;
        }

        return j-i+1;


    }
  
}

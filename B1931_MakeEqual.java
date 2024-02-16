import javax.swing.*;
import java.util.Scanner;

public class B1931_MakeEqual
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans[] = new String[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getAns(sc);
        }

        for(String s : ans)
            System.out.println(s);
    }

    public static String getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        long avg=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg/=n;

        int bal=0;

        for(int i=0;i<n;i++)
        {
            bal+=arr[i]-avg;
            if(bal<0)
                return "NO";
        }


        return "YES";
    }
  
}

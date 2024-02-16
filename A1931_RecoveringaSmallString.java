import java.util.Arrays;
import java.util.Scanner;

public class A1931_RecoveringaSmallString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans[] = new String[t];
        char arr[] = new char[27];
        char c = 'a';
        for(int i=1;i<=26;i++)
        {
            arr[i]=c++;
        }

//        System.out.println(Arrays.toString(arr));

        int n=0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            ans[i]=getAns(n, arr);
        }

        for(String s : ans)
            System.out.println(s);
    }

    public static String getAns(int n, char arr[])
    {
//        char arr[] = new char[27];
//        char c = 'a';
//        for(int i=1;i<=26;i++)
//        {
//            arr[i]=c++;
//        }

        if(n<=28)
        {
            return "aa"+arr[n-2];
        }
        else if(n>28 && n<=52)
        {
            return "a"+arr[n-26-1]+arr[26];
        }
        else
        {
            return ""+arr[n-52]+"zz";
        }

    }
  
}

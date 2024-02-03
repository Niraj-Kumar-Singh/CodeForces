import java.util.Arrays;
import java.util.Scanner;

public class A1027_PalindromicTwist
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String arr[] = new String[t];
//        char c[] = new char[26];
//        c[0]='a';
//        for(int i=1;i<26;i++)
//        {
//            c[i]=(char)(c[i-1]+1);
//        }

//        System.out.println(Arrays.toString(c));

        for(int i=0;i<t;i++)
        {
            arr[i]=getAns(sc);
        }

        for(String s : arr)
            System.out.println(s);
    }

    public static String getAns(Scanner sc)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int start=0, end = n-1;

        while(start<end)
        {
//            System.out.println(s.charAt(start) + "  " + s.charAt(end));

            int istart=s.charAt(start)-'a';
            int iend=s.charAt(end)-'a';
//            System.out.println(istart+"  "+iend);
            if(istart!=iend && Math.abs(iend-istart)!=2)
            {
                return "NO";
            }
            start++;
            end--;


        }

        return "YES";
    }
  
}

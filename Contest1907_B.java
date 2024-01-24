import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Contest1907_B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for(int i=0;i<tests;i++)
        {
            String s = sc.next();

            System.out.println(processedString(s));
        }
    }

    public static String processedString(String s)
    {
        Stack<Integer> lower = new Stack<>();
        Stack<Integer> upper = new Stack<>();




//        System.out.println(upper.toString());
//        System.out.println(lower.toString());
        char arr[] =s.toCharArray();
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);


//            if(c>='A' && c<='Z' && c!='B')
//                upper.push(i);
//            else if(c>='a' && c<='z' && c!='b')
//                lower.push(i);

            if(c=='B')
            {
                arr[i]='&';
                if(!upper.isEmpty())
                {
                    int index = upper.pop();
                    arr[index] = '&';
                }
            }
            else if(c=='b')
            {
                arr[i]='&';

                if(!lower.isEmpty())
                {
                    int index = lower.pop();
                    arr[index] = '&';
                }
            }
            else if(c>='A' && c<='Z')
                upper.push(i);
            else if(c>='a' && c<='z')
                lower.push(i);
        }


        String ans="";

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='&')
                ans+=arr[i];
        }

        return ans;



    }
  
}

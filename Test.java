import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Test
{
    public static void main(String[] args)
    {
//        String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
////        String s = "sd2[f2[e]g]i";
//
//        System.out.println(decodeString2(s));
        System.out.println(kInversePairs(120, 120));

    }

    public static int kInversePairs(int n, int k) {
        int MOD = 1000000007;
        long dp[][] = new long[n+1][k+1];
        dp[0][0]=1;

        for(int i=1;i<=n;i++)
        {

            dp[i][0]=1;
            for(int j=1;j<=k;j++)
            {
                dp[i][j]=(int)(dp[i-1][j]%MOD+dp[i][j-1])%MOD;

                if(j>=i)
                    dp[i][j]=(int)(dp[i][j]%MOD-dp[i-1][j-i]%MOD)%MOD;
            }
        }
        for(long arr[] : dp)
        {
            System.out.println(Arrays.toString(arr));
        }

        return (int)dp[n][k]%MOD;
    }
//   zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef
//   zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef
//   zzzyypqjkjkefyypqjkjkefyypqjkjkefyypqjkjkefyypqjkjkefyypqjkjkefyypqjkjkefyypqjkjkefef

    public static String decodeString(String s)
    {
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        Stack<Character> brackets = new Stack<>();

        String ans = "";

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c>='0' && c<='9')
            {
                String n = c+"";

                while(i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='9')
                {
                    n+=s.charAt(++i);
                }

                int x = Integer.parseInt(n);
                num.push(x);
            }
            else if(c>='a' && c<='z')
            {
                boolean free = false;
                if(i-1<0 || s.charAt(i-1)!='[')
                    free=true;
                String s1 = ""+c;

                while(i+1<s.length() && s.charAt(i+1)>='a' && s.charAt(i+1)<='z')
                {
                    s1+=s.charAt(++i);
                }

                if(free)
                {
                    if(!brackets.isEmpty())
                    {
                        if(!str.isEmpty())
                        {
                            String temp=str.pop();
                            temp+=s1;
                            str.push(temp);
                        }
                        else
                        {
                            str.push(s1);
                        }



                    }
                    else
                        ans+=s1;
                }
                else
                {
                    str.push(s1);
                }


            }
            else if(c==']')
            {
//                if(str.size()>1)
//                {
//                    String s1=str.pop();
//                    String temp=str.pop();
//                    temp+=s1;
//                    str.push(temp);
//                }
                if(s.charAt(i-1)==']')
                {
                    String s1=str.pop();
                    String temp=str.pop();
                    temp+=s1;
                    str.push(temp);
                }
                String s1 = str.pop();
                int x = num.pop();
                String res="";
                while(x>0)
                {
                    res+=s1;
                    x--;
                }
                brackets.pop();

                if(brackets.isEmpty())
                {
                    ans+=res;
                }
                else
                {
//                    if(!str.isEmpty())
//                    {
//                        String temp=str.pop();
//                        temp+=res;
//                        str.push(temp);
//                    }
//                    else
//                    {
//                        str.push(res);
//                    }

                    str.push(res);

                }

            }
            else
            {
                brackets.push(c);
            }
        }

        if(!str.isEmpty())
            ans+=str.pop();


        return ans;
    }


    public static String decodeString2(String s)
    {

        //String s = "sd2[f2[e]g]i";
        Stack<String> str = new Stack<>();
        String ans = "";

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c==']')
            {
                String s1 = "";
                while(!str.isEmpty() && !str.peek().equals("["))
                {
                    s1=str.pop()+s1;
                }
                if(!str.isEmpty() && str.peek().equals("["))
                    str.pop();



                if(!str.isEmpty())
                {
                    String num = str.pop();
                    int x = Integer.parseInt(num);
                    String res="";
                    while(x>0)
                    {
                        x--;
                        res+=s1;
                    }

                    str.push(res);
                }



            }
            else if(c>='0' && c<='9')
            {
                String n = c+"";

                while(i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='9')
                {
                    n+=s.charAt(++i);
                }
                str.push(n);
            }
            else
                str.push(c+"");
        }

        while(!str.isEmpty())
        {
            ans=str.pop()+ans;
        }
        return ans;
    }
  
}

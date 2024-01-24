import java.util.Scanner;

public class Contest160_B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            String s = sc.next();

            System.out.println(getCost(s));
        }
    }

    public static int getCost(String s)
    {
        int count0=0;
        int count1=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                count1++;
            else
                count0++;
        }
//        int cost=0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c=='0')
            {
                if(count1>0)
                    count1--;
                else
                    return s.length()-i;
            }
            else
            {
                if(count0>0)
                    count0--;
                else
                    return s.length()-i;
            }
        }

        return 0;
    }
  
}

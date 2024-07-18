import java.util.Scanner;

public class B1566_MIN_MEXCut
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            System.out.println(getAns(sc));


        }
    }

    public static int getAns(Scanner sc)
    {
        String s = sc.nextLine();
        int one=0, zero=0;
        int change=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                one++;
            else
                zero++;

            if(s.charAt(i)=='0')
            {
                change++;
                int j=i;
                while(j<s.length() && s.charAt(j)=='0')
                    j++;
                i=j-1;
            }
        }

//        System.out.println(change);
        if(one==0 || change==1)
            return 1;

        if(zero<=1)
            return zero;

        return 2;
    }
  
}

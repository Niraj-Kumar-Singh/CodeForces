import java.util.ArrayList;
import java.util.Scanner;

public class B96_LuckyNumbers_easy
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        String s = sc.nextLine();
        int sNum = Integer.parseInt(s);
        int len = s.length();



        if(sNum<=47)
        {
            System.out.println(47);
        }
        else if(len%2!=0)
        {
            System.out.println(getLuckyNumber(s, len+1));
        }
        else
        {
            long ans = getLuckyNumber(s, len);

            if(ans!=0)
                System.out.println(ans);
            else
                System.out.println(getLuckyNumber(s, len+2));
        }



    }

    public static long  getLuckyNumber(String num, int len)
    {
        long n = Long.parseLong(num);

        ArrayList<Long> list = new ArrayList<>();

        getNums("", len/2, len/2, len ,list);

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=n)
                return list.get(i);
        }

        return 0;
    }

    public  static void getNums(String num, int count4, int count7, int len, ArrayList<Long> list)
    {
        if(num.length()==len)
        {
            list.add(Long.parseLong(num));
            return;
        }


        if(count4>0)
            getNums(num+'4', count4-1, count7, len, list);

        if(count7>0)
            getNums(num+'7', count4, count7-1, len, list);
    }
  
}

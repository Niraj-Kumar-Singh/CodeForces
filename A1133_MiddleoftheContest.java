import java.util.Scanner;

public class A1133_MiddleoftheContest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();
        String end = sc.nextLine();

        int h1 = Integer.parseInt(start.substring(0,2));
        int m1 = Integer.parseInt(start.substring(3));

        int h2 = Integer.parseInt(end.substring(0,2));
        int m2 = Integer.parseInt(end.substring(3));

        int time = 0;

        if(h1==h2)
        {
            time+=m2-m1;
            time/=2;
            int m=m1+time;
            System.out.println(start.substring(0,2)+":"+(m>=10 ? m : ("0"+m)));
        }
        else if(m1==m2)
        {
            time+=(h2-h1)*60;
            time/=2;

            int h = time/60+h1;
            int m = m1+time%60;
            if(m>=60)
            {
                h++;
                m-=60;
            }
            System.out.println((h>=10 ? h : ("0"+h)) + ":" + (m>=10 ? m : ("0"+m)));
        }
        else
        {
            time+=60-m1;
            time+=(h2-h1-1)*60;
            time+=m2;

            time/=2;
            int h = h1+time/60;
            int m = m1+time%60;
            if(m>=60)
            {
                h++;
                m-=60;
            }
            System.out.println((h>=10 ? h : ("0"+h)) + ":" +(m>=10 ? m : ("0"+m)));
        }

    }
  
}

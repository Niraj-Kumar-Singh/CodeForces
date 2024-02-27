import java.util.Scanner;

public class C371_Hamburgers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int rs=0, rb=0, rc=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='B')
                rb++;
            else if (c=='S')
                rs++;
            else
                rc++;
        }


        int nb=sc.nextInt();
        int ns=sc.nextInt();
        int nc=sc.nextInt();

        int pb=sc.nextInt();
        int ps=sc.nextInt();
        int pc=sc.nextInt();

        long money = sc.nextLong();

        long burgers=0;

        long start=0, end = money+200;

        while(start<=end)
        {
            long mid = start + (end-start)/2;

//            System.out.println("Mid="+mid);

            long currB = rb*mid;
            long currS = rs*mid;
            long currC = rc*mid;

//            System.out.println("currB="+currB+", currS="+currS+", currC="+currC);

            long costB = rb==0 ? 0 : currB >= nb ? (currB-nb)*pb : 0;
            long costS = rs==0 ? 0 : currS >= ns ? (currS-ns)*ps : 0;
            long costC = rc==0 ? 0 : currC >= nc ? (currC-nc)*pc : 0;

//            System.out.println("costB="+costB+", costS="+costS+", costC="+costC);

            if(costS+costB+costC <= money)
            {
                start=mid+1;
            }
            else
                end=mid-1;

//            System.out.println("Start="+start+", End="+end);
        }

        System.out.println(end);


    }
  
}

import java.util.Scanner;

public class A352_JeffAndDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int count5=0;
        int count0=0;

        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();

            if (x==5)
                count5++;
            else
                count0++;

        }

        while(count0>0 && count5>0)
        {
            if((5*count5)%9==0)
                break;
            else
                count5--;
        }



        if(count0>0)
        {
            String ans="";
            for(int i=0;i<count5;i++)
            {
                ans+="5";
            }

            if(!ans.isEmpty())
            {
                for(int i=0;i<count0;i++)
                {
                    ans+="0";
                }
            }
            else
                ans+="0";


            System.out.println(ans);
        }
        else
            System.out.println(-1);


    }

}

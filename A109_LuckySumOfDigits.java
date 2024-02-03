import java.util.Scanner;

public class A109_LuckySumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int count4=0, count7=0;
        while(n>0 && n%7!=0)
        {
            n-=4;
//            System.out.println(n);
            count4++;
        }

        if(n%4!=0 && n%7!=0)
            System.out.println(-1);
        else
        {
            System.out.println(getNumber("4", count4).append(getNumber("7", n/7)));

        }


    }

    public static StringBuilder getNumber(String digit, int count)
    {
        StringBuilder s = new StringBuilder();

        for(int i=0;i<count;i++)
        {
            s.append(digit);
        }

        return s;
    }
  
}

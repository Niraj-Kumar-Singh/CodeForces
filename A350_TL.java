import java.util.Scanner;

public class A350_TL
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxCorrect = Integer.MIN_VALUE;
        int minCorrect = Integer.MAX_VALUE;
        int x=0;

        for(int i=0;i<n;i++)
        {
            x = sc.nextInt();
            maxCorrect=Math.max(x, maxCorrect);
            minCorrect=Math.min(x, minCorrect);

        }


        int minIncorrect = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            x = sc.nextInt();
            minIncorrect = Math.min(minIncorrect, x);
        }

        int time = Math.max(2*minCorrect ,  maxCorrect);

        if(time<minIncorrect)
            System.out.println(time);
        else
            System.out.println(-1);



    }

}




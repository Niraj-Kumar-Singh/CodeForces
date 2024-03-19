import java.util.Scanner;

public class A1395_BoboniuLikesToColorBalls
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println(getAns(sc));
        }
    }

    public static String getAns(Scanner sc)
    {
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();


        int countEven = 0;
        if(r%2==0)
            countEven++;
        if(g%2==0)
            countEven++;
        if(b%2==0)
            countEven++;
        if(w%2==0)
            countEven++;

        if((countEven<=1 && r>0 && g>0 && b>0) || countEven>=3)
            return "YES";




        return "NO";
    }
  
}

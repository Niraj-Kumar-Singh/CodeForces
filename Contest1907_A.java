import java.util.Scanner;

public class Contest1907_A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for(int i=0;i<tests;i++)
        {
            String place = sc.next();
//            System.out.println(place);

            displayMoves(place);
        }
    }

    public static void displayMoves(String place)
    {
        int x = Integer.parseInt(""+place.charAt(1));
        char c = place.charAt(0);

        for(int i=1;i<x;i++)
            System.out.println(c+""+i);

        for(int i=x+1;i<9;i++)
            System.out.println(c+""+i);

        for(char ch='a'; ch<c;ch++)
            System.out.println(ch+""+x);

        for(char ch=(char)(c+1); ch<'i';ch++)
            System.out.println(ch+""+x);



    }
  
}

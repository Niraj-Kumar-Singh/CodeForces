import java.util.Scanner;

public class B1567_MEXorMixup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static int getAns(Scanner sc)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Time Complexity : O(1)
        int xor=getXOR(a-1); // To get XOR of numbers from 1 to n
        xor=xor^0; // Since 0 is also to be included

        // Time Complexity : O(n) - to get XOR of 'n' numbers
//        for(int i=1;i<a;i++)
//        {
//            xor=xor^i;
//        }

        if(xor==b)
            return a;

        if((xor^b)!=a)
            return a+1;


        return a+2;
    }

    public static int getXOR(int n)
    {

        if(n%4==0)
            return n;
        else if(n%4==1)
            return 1;
        else if(n%4==2)
            return n+1;


        return 0;  // if(n%4==3)
    }
  
}

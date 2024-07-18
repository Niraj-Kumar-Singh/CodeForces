import java.util.Scanner;

public class C1941_RudolfandtheUglyString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0)
        {
            System.out.println(getAns(sc));
        }


    }

    public static int getAns(Scanner sc)
    {
        int count=0;

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='p' && i+2<n)
            {
                if(s.charAt(i+1)=='i' && s.charAt(i+2)=='e')
                {
                    i+=2;
                    count++;
                }
            }
            else if(s.charAt(i)=='m' && i+2<n)
            {
                if(s.charAt(i+1)=='a' && s.charAt(i+2)=='p')
                {
                    i+=2;
                    count++;
                }
            }
        }

        return count;
    }
  
}

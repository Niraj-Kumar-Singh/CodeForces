import java.util.Scanner;

public class Contest1926A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        String s = "";
        int countA=0;
        int countB=0;
        for(int i=0;i<t;i++)
        {
            s=sc.nextLine();
            countA=0;
            countB=0;
            for(int j=0;j<s.length();j++)
            {
                char c = s.charAt(j);
                if(c=='A')
                    countA++;
                else
                    countB++;


            }

            System.out.println(countA>countB ? 'A' :  'B');
        }
    }
  
}

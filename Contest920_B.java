import java.util.Scanner;

public class Contest920_B
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getDays(sc);
        }

        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }
    }

    public static int getDays(Scanner sc )
    {
        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        String f = sc.nextLine();

        int countS=0;
        int countF=0;

        for(int i=0;i<n;i++)
        {
//            System.out.println(s.charAt(i) +  "  " + f.charAt(i));
            if(s.charAt(i)==f.charAt(i))
                continue;
            else
            {
                if(s.charAt(i)=='1')
                    countS++;
                else
                    countF++;
            }
        }

//        System.out.println(countS+ "  " + countF);
        return Math.max(countF, countS);
    }
}


/*

            for (int start = 0; start < s.length(); start++)
            {
                for (int finish = start; finish < s.length(); finish++)
                {
                    int[] substringSignature = new int[ALPHABET.length()];
                    for (int j = start; j <= finish; j++)
                    {
                        substringSignature[s.charAt(j) - ALPHABET.charAt(0)]++;
                    }
                    String signatureString = arrayToString(substringSignature);
                    signatures.put(signatureString, signatures.getOrDefault(signatureString, 0) + 1);
                }
            }

 */



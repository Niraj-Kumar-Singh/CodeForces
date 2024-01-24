import java.util.Scanner;

public class B476_DreamoonAndWiFi
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String originalMsg = sc.nextLine();
        String msg = sc.nextLine();

        int ans=0;

        for(int i=0;i<originalMsg.length();i++)
        {
            if(originalMsg.charAt(i)=='+')
                ans++;
            else
                ans--;
        }

        int msgAns = 0;
        int countUnknown=0;

        for(int i=0;i<msg.length();i++)
        {
            if(msg.charAt(i)=='+')
                msgAns++;
            else if(msg.charAt(i)=='-')
                msgAns--;
            else countUnknown++;
        }

        int countNeg=0;
        int countPos=countUnknown;

        boolean isPossible=false;
        while(countNeg<=countUnknown)
        {
            if(msgAns+countPos-countNeg == ans)
            {
                isPossible = true;
                break;
            }
            countPos--;
            countNeg++;
        }

        if(isPossible)
        {
            int factorial[] = new int[11];
            factorial[0]=1;
            for(int i=1;i<11;i++)
            {
                factorial[i]=factorial[i-1]*i;
            }

            double desiredCombinations = factorial[countUnknown]/(factorial[countNeg]*factorial[countPos]);

            double totalCombinations = Math.pow(2, countUnknown);

            System.out.println((double)desiredCombinations/totalCombinations);
        }
        else {
            System.out.println((double)0);
        }





    }
}

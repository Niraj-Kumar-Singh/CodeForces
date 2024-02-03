import java.util.Scanner;

public class B1244_RoomsAndStaircases
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getRooms(sc);
        }

        for(int x : ans)
            System.out.println(x);

    }

    public static int getRooms(Scanner sc)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int start=0, end=s.length()-1;

        while(start<=end && s.charAt(start)!='1' && s.charAt(end)!='1')
        {
            start++;
            end--;
        }

        if(start>end)
        {
            return s.length();
        }
        else if(start==end && s.charAt(start)=='1')
        {
            return 2*(start+1);
        }

        int closest1Dist = Math.min(start, s.length()-end-1);

        return 2*(s.length()-closest1Dist);


    }
  
}

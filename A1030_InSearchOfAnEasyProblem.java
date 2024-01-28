import java.util.Scanner;

public class A1030_InSearchOfAnEasyProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "EASY";
        int x = 0;
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            if(x==1 && ans.equals("EASY"))
                ans="HARD";
        }

        System.out.println(ans);
    }
  
}

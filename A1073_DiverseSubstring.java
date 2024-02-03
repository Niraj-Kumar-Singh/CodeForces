import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1073_DiverseSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s  =sc.nextLine();
        boolean found=false;

        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                found=true;
                System.out.println("YES");
                System.out.println(s.substring(i, i+2));
                break;
            }
        }

        if(!found)
            System.out.println("NO");

    }
  
}

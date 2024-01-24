import java.util.Scanner;

public class A270_FancyFence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int a = 0;
        for(int i=0;i<t;i++)
        {
            a = sc.nextInt();
            
            if(360%(180-a)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
  
}

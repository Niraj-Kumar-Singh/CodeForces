import java.util.Scanner;

public class B268_Buttons
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=n;i>=1;i--)
        {
            count+=i;
            count+=(n-i)*(i-1);
        }

        System.out.println(count);


    }
  
}

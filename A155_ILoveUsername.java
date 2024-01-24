import java.util.Scanner;

public class A155_ILoveUsername
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max=sc.nextInt();
        int min=max;
        int count=0;

        for(int i=1;i<n;i++)
        {
            int x = sc.nextInt();

            if(x>max)
            {
                max=x;
                count++;
            }
            else if(x<min)
            {
                min=x;
                count++;
            }
        }

        System.out.println(count);
    }
  
}

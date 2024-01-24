import java.util.Scanner;

public class A272_DimaAndFriends
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int sum=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            sum+=x;
        }

        n+=1;
        int ans=0;

        for(int i=1;i<=5;i++)
        {
            if((i+sum)%n!=1)
            {
                ans++;
            }
        }

        System.out.println(ans);

    }
  
}

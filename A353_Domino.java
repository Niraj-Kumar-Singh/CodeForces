import java.util.Scanner;

public class A353_Domino
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int upper[]=new int[n];
        int lower[]=new int[n];


        int uSum=0;
        int lSum=0;
        for(int i=0;i<n;i++)
        {
            upper[i] =sc.nextInt();
            lower[i] =sc.nextInt();

            uSum+=upper[i];
            lSum+=lower[i];

        }

        if(lSum%2==0 && uSum%2==0)
        {
            System.out.println(0);
        }
        else if((lSum%2==0 && uSum%2!=0) || (lSum%2!=0 && uSum%2==0))
        {
            System.out.println(-1);
        }
        else
        {

            boolean isPresent = false;

            for(int i=0;i<n;i++)
            {
                if((upper[i]%2==0 && lower[i]%2!=0) || (upper[i]%2!=0 && lower[i]%2==0))
                {
                    isPresent=true;
                    System.out.println("1");
                    break;
                }
            }

            if(!isPresent)
                System.out.println(-1);
        }



    }
  
}

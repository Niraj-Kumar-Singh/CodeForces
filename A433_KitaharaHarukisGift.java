import java.util.Scanner;

public class A433_KitaharaHarukisGift
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n200=0;
        int n100=0;

        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            if(x==200)
                n200++;
            else
                n100++;
        }

//        if(n==1)
//            System.out.println("NO");
//        else if(n200%2==0 && n100%2==0)
//        {
//            System.out.println("YES");
//        }
//        else if(n200%2==0 && n100%2!=0)
//        {
//            System.out.println("NO");
//        }
//        else if(n200%2!=0 && n100%2==0 && n100>0)
//        {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }


        if((n200%2!=0 && n100%2==0 && n100>0) || (n200%2==0 && n100%2==0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

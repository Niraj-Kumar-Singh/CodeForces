import java.util.Scanner;

public class B339_XeniaAndRingroad
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();

        long count=0;
        int index=0;


        for(int i=0;i<m;i++)
        {
            int house=sc.nextInt()-1;
            count+=(n-index+house)%n;
            index=house;
        }


        System.out.println(count);


    }
  
}

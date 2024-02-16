import java.util.Scanner;

public class B1367_EvenArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println(printAns(sc));
        }
    }

    public static int printAns(Scanner sc)
    {
        int n = sc.nextInt();

        int x=0;

        int countEven=0;
        int wrongEven=0;

        for(int i=0;i<n;i++)
        {

            x=sc.nextInt();
            if(x%2==0)
                countEven++;

            if(i%2==0 && x%2!=0)
                wrongEven++;
        }


        if((n%2==0 && n/2!=countEven) || (n%2!=0 && n/2+1!=countEven))
            return -1;


        return wrongEven;
    }
  
}

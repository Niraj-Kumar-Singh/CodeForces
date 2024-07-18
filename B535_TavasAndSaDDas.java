import java.util.Scanner;

public class B535_TavasAndSaDDas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int arr[] = new int[n.length()];

        for(int i=0;i<n.length();i++)
        {
            char c = n.charAt(i);

            if(c=='4')
                arr[i]=0;
            else
                arr[i]=1;
        }

        long count=arr[arr.length-1];
        int base = 2;

        for(int i=arr.length-2;i>=0;i--)
        {
            count+=((long)arr[i]*base);
            base*=2;
        }

        int pow = arr.length-1;

        long r = 1;
        for(int i=0;i<pow;i++)
        {
            r*=2;
        }

        count+=2*r;

        System.out.println(count-1);
    }
  
}

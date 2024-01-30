import java.util.Scanner;

public class A492_VanyaAndCubes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=0;
        int sum=0;

        while(sum+i+1<=n)
        {
            i++;
            sum+=i;
            n-=sum;

        }

        System.out.println(i);
    }
  
}

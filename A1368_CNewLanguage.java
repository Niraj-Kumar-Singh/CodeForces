import java.util.Scanner;

public class A1368_CNewLanguage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int arr[] = new int[t];

        int a=0, b=0, n=0;

        for(int i=0;i<t;i++)
        {
            a= sc.nextInt();
            b= sc.nextInt();
            n= sc.nextInt();
            arr[i]=getMinOps(a, b, n);
        }

        for(int x : arr)
            System.out.println(x);

    }

    public static int getMinOps(int a, int b, int n)
    {

        int count=0;
        while(a<=n && b<=n)
        {
            if(a>b)
            {
                b+=a;
            }
            else
            {
                a+=b;
            }

            count++;
        }

        return  count;
    }
  
}

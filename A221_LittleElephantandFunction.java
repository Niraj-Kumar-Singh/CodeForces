import java.util.Scanner;

public class A221_LittleElephantandFunction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            arr[i]=i;
        }

        for(int i=n;i>1;i--)
        {
            int t=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=t;
        }

        System.out.print(arr[1]);
        for(int i=2;i<=n;i++)
        {
            System.out.println(" "+arr[i]);
        }

    }
  
}

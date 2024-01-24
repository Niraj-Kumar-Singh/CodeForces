import java.util.Scanner;

public class B285_FindMarble
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int arr[]=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }




        if(s==t)
            System.out.println(0);
        else
        {
           int  index=s;
            int count=0;
            boolean isPossible = true;

            while(arr[index]!=t)
            {
                count++;
                index=arr[index];
                if(arr[index]==s)
                {
                    isPossible=false;
                    break;
                }
            }

            if(isPossible)
                System.out.println(count+1);
            else
                System.out.println(-1);
        }
    }
  
}

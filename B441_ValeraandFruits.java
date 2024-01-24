import java.util.Scanner;

public class B441_ValeraandFruits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v = sc.nextInt();

        int arr[] = new int[3001];


        for(int i=0;i<n;i++)
        {
            arr[sc.nextInt()]+= sc.nextInt();
        }

        int prev=0;
        int curr=0;
        int sum=0;
        for(int i=0;i<3001;i++)
        {
            curr=arr[i];
            if(prev+curr<=v)
            {
                sum+=(prev+curr);
                prev=0;
            }
            else
            {
                int tv=Math.max(v-prev, 0);
                prev=curr-tv;

                sum+=v;
            }
        }

        sum+=Math.min(prev, v);

        System.out.println(sum);

    }

}

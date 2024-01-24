import java.util.*;

public class B315_SerejaAndArray
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long arr[] = new long[n];
        ArrayList<Long> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        int t=0;
        int add=0;
        int index=0;
        for(int i=0;i<m;i++)
        {
            t = sc.nextInt();

            if(t==1)
            {
                index = sc.nextInt()-1;
                arr[index] = sc.nextInt();
                arr[index]-=add;
            }
            else if(t==2)
            {
                add+=sc.nextInt();
            }
            else
            {
                index = sc.nextInt()-1;
                ans.add(arr[index]+add);
            }
        }

        for(long x : ans)
            System.out.println(x);

    }
}

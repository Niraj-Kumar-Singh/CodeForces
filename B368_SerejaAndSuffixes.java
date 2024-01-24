import java.util.HashSet;
import java.util.Scanner;

public class B368_SerejaAndSuffixes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int l[]=new int[m];
        for(int i=0;i<m;i++)
        {
            l[i]=sc.nextInt();
            l[i]-=1;
        }


        int ans[]=new int[n];
        ans[n-1]=1;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            int x = arr[i];
            if(!hs.contains(x))
            {
                ans[i]=ans[i+1]+1;
                hs.add(x);

            }
            else
                ans[i]=ans[i+1];
        }

        for(int i=0;i<m;i++)
        {
            int index=l[i];
            System.out.println(ans[index]);
        }

//

    }
  
}

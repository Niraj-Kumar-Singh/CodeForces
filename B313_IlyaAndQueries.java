import java.util.Scanner;

public class B313_IlyaAndQueries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();
        int sum[] = new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
                sum[i]=sum[i-1]+1;
            else
                sum[i]=sum[i-1];
        }

        int m = sc.nextInt();
        int ans[] = new int[m];
        int l=0, r=0;
        for(int i=0;i<m;i++)
        {
            l=sc.nextInt()-1;
            r=sc.nextInt()-1;
            ans[i]=sum[r]-sum[l];

        }

        for (int i=0;i<m;i++)
        {
            System.out.println(ans[i]);
        }
    }
  
}

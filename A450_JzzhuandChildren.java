import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class A450_JzzhuandChildren
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        Queue<Integer> q = new ArrayDeque<>();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
            q.add(i);
        }

        int index = 1;
        while(!q.isEmpty())
        {
            index = q.poll();
//            int x = arr[index];
            arr[index]-=m;

            if(arr[index]>0)
                q.add(index);


        }

        System.out.println(index);
    }
  
}

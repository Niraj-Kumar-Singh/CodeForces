import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B218_Airport
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

//        Integer maxArr[] = new Integer[m];
        PriorityQueue<Integer> pq = new PriorityQueue<>(m, Collections.reverseOrder());
        Integer minArr[] = new Integer[m];

        for(int i=0;i<m;i++)
        {
            minArr[i]=sc.nextInt();
            pq.offer(minArr[i]);
        }

//        Arrays.sort(maxArr, Collections.reverseOrder());
        Arrays.sort(minArr);


//        System.out.println(Arrays.toString(maxArr));
//        System.out.println(Arrays.toString(minArr));

//        4 3
//        2 1 1


        int max = 0;
        int x = n;
        while(x>0)
        {
            int y = pq.poll();
            max+=y;
            y--;
            pq.offer(y);
            x--;


        }



        int index=0;
        int min = 0;
        while(n>0)
        {
            if(minArr[index]>=n)
            {
                while(n>0 && index<m)
                {
                    min+=minArr[index]--;
                    n--;
                }
                n=0;
            }
            else
            {
                n-=minArr[index];
                int y = minArr[index];
                min+=(y*(y+1))/2;
                minArr[index]=0;
                index++;
//                System.out.println("n="+n);
//                System.out.println("min="+min);

            }
        }


        System.out.println(max + " " + min);

    }

    public static int factorial(int n)
    {

        if(n==1 || n==2)
            return n;
        int ans=1;

        while(n>1)
        {
            ans*=n;
            n--;
        }

        return ans;
    }
  
}

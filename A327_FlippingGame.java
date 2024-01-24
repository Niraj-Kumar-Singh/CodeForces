import java.util.Scanner;

public class A327_FlippingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count1=0;
        int count0=0;
        int count0Max=-1;

//       1 0 0 0 1 0 0 0
/*
c1=0, c0=0, c0m=-1;
    1 ->  c1=1  c0=0  c0m=-1
    0 ->  c1=1  c0=1  c0m=1
    0 ->  c1=1  c0=2  c0m=2
    0 ->  c1=1  c0=3  c0m=3
    1 ->  c1=2  c0=2  c0m=3
    0 ->  c1=2  c0=3  c0m=3
    0 ->  c1=2  c0=4  c0m=4
    0 ->  c1=2  c0=5  c0m=5

    ans = c1+c0m = 2 + 5 = 7

//   1
c1=0, c0=0, c0m=-1;
    1 ->  c1=1  c0=0  c0m=-1



 */

        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();

            if(x==1)
            {
                count1++;
                count0--;
                count0=Math.max(0, count0);
            }
            else {
                count0++;
                count0Max=Math.max(count0, count0Max);
            }



        }

        System.out.println(count1+count0Max);



    }
  
}

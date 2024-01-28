import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1352_SumofRoundNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int arr[] = new int[t];

        for(int i=0;i<t;i++)
        {
            arr[i] = sc.nextInt();

        }

        for(int i=0;i<t;i++)
        {

            displayAns(arr[i]);
        }
    }

    public static void displayAns(int n)
    {
        int count=0;
        List<Integer> list = new ArrayList<>();

        int div=10;

        while(div<n)
        {
            int d = n%div;
            if(d!=0)
            {
                list.add(d);
                n-=d;
                count++;
            }

            div*=10;
        }

        list.add(n);

        System.out.println(count+1);
//        System.out.println(list);

        for(int x: list)
            System.out.print(x+" ");

        System.out.println();
    }
  
}

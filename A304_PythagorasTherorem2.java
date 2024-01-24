import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class A304_PythagorasTherorem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        for(int i=1;i<=n;i++)
        {
            hs.add(i*i);

        }

        int count=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(hs.contains(i*i + j*j))
                        count++;
            }
        }


        System.out.println(count);
    }
  
}

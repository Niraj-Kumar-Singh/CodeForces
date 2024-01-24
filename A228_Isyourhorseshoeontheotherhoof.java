import java.util.HashSet;
import java.util.Scanner;

public class A228_Isyourhorseshoeontheotherhoof
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        HashSet<Integer> hs = new HashSet<>();


        for(int i=0;i<4;i++)
        {
            int x=sc.nextInt();
            if(!hs.contains(x))
                hs.add(x);
        }


        System.out.println(4-hs.size());
    }
  
}

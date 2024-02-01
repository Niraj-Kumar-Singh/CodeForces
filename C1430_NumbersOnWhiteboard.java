import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1430_NumbersOnWhiteboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<ArrayList<Integer>> ans = new ArrayList<>(t);
        for(int i=0;i<t;i++)
        {
            ans.add(removeNumbers(sc));
        }

        for(int i=0;i<t;i++)
        {
            display(ans.get(i));
        }

    }

    public static ArrayList<Integer> removeNumbers(Scanner sc)
    {
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(2*(n-1));

        int end = n;
        int nxtElement = n-1;

        for(int i=1;i<end;i++)
        {
            list.add(n);
            list.add(nxtElement);

            if((n%2==0 && nxtElement%2!=0) || (n%2!=0 && nxtElement%2==0))
            {

                n=(n+nxtElement)/2+1;
//                System.out.println("n="+n+", nxtElement="+(nxtElement-1));
            }
            else
                n=(n+nxtElement)/2;
            nxtElement--;




        }
        list.add(n);

        return list;
    }

    public static void display(ArrayList<Integer> list)
    {
        System.out.println(list.get(list.size()-1));


        for(int i=0;i<list.size()-1;i+=2)
        {
            System.out.println(list.get(i)+" "+ list.get(i+1));
        }

//        System.out.println(list);
    }
  
}

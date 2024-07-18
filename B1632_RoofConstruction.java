import java.util.Scanner;

public class B1632_RoofConstruction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            printAns(sc);
        }


    }

    public static void printAns(Scanner sc)
    {
//        System.out.println("Enter");
        int n = sc.nextInt();
        int k = n-1;

        int count=-1;
        while(k>0)
        {
            k=k>>1;
            count++;
        }

//        System.out.println(count);
        int start = 1 << count; // 2^count
//        System.out.println(start);

        for(int i=start-1;i>=0;i--)
        {
            System.out.print(i+" ");
        }

        for(int i=start;i<n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
  
}

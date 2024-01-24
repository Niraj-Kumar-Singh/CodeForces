import java.util.Scanner;

public class A104_BlackJack
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int arr[] = new int[12];

        for(int i=1;i<12;i++)
        {
            arr[i]=4;
        }

        arr[10]+=11;

        int n = sc.nextInt();

        if(n>21 || n<10)
            System.out.println(0);
        else
            System.out.println(arr[n-10]);
    }
  
}

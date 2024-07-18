import java.util.Scanner;

public class B1847_HamonOdyssey
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            System.out.println(getAns(sc));
        }
    }

    public static int getAns(Scanner sc)
    {
        int n =sc.nextInt();

        int arr[] = new int[n];
        arr[0]=sc.nextInt();
        int and = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();
            and=and&arr[i];
        }

        if(and>0)
            return 1;

        int count=0;

        and = arr[0];

        for(int i=1;i<n;i++)
        {
            if(and==0)
            {
                and=arr[i];
                count++;
            }
            else
            {
                and=and&arr[i];
            }
        }

        if(and == 0)
            count++;

        return count;
    }
  
}

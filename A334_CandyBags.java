import java.util.Scanner;

public class A334_CandyBags
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();


        int start=1, end=n*n;

        while(start<end)
        {
            System.out.println(start++ + " " + end--);
        }
    }
  
}

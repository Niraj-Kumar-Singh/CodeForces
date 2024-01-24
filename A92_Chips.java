import java.util.Scanner;

public class A92_Chips
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int chips = sc.nextInt();

        int i=0;
        while(chips>0)
        {
            i=i%n;
            if(chips>=i+1)
            {
                chips-=i+1;
            }
            else
                break;

            i++;
        }

        System.out.println(chips);
    }
  
}

import java.util.Scanner;

public class C437_TheChildandToy
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int energy[] = new int[n+1];

        for(int i=1;i<=n;i++)
        {
            energy[i]=sc.nextInt();
        }

        int x=0,y=0;
        int totalEnerygy=0;
        for(int i=0;i<m;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();

            totalEnerygy+=Math.min(energy[x], energy[y]);
        }

        System.out.println(totalEnerygy);
    }
}

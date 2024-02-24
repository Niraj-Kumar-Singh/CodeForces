import java.util.Scanner;

public class B463_CaisaAndPylons
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        int cost = 0;

        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
            cost = Math.max(cost, arr[i]);
        }


        int energy=cost;

        for(int i=0;i<n;i++)
        {
            int currEnergy = arr[i]-arr[i+1];

            if(energy+currEnergy<0)
            {
                cost+=currEnergy;
            }
            else
            {
                energy+=currEnergy;
            }
        }

        System.out.println(cost);

    }
  
}

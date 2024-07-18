import java.util.Scanner;

public class B467_FedorandNewGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }

        int Fedor = sc.nextInt();

        int friends=0;

        for(int player : arr)
        {
            int fedor = Fedor;
            int count=0;
            while(fedor>0 && player>0 && count<=k)
            {
                if((fedor & 1) != (player & 1))
                {
                    count++;
                }

                fedor = fedor >> 1;
                player = player >> 1;
            }

            while(fedor > 0)
            {
                if((fedor & 1) == 1)
                    count++;

                fedor = fedor >> 1;
            }

            while(player > 0)
            {
                if((player & 1) == 1)
                    count++;

                player = player >> 1;
            }

            if(count<=k)
                friends++;

        }

        System.out.println(friends);
    }

  
}

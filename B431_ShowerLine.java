import java.util.Scanner;

public class B431_ShowerLine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][]=new int[5][5];

        int people[]=new int[5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int max=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                    continue;
                for(int k=0;k<5;k++)
                {
                    if(k==i || k==j)
                        continue;

                    for(int l=0;l<5;l++)
                    {
                        if(l==i || l==j || l==k)
                            continue;

                        for(int m=0;m<5;m++)
                        {
                            if(m==i || m==j || m==k || m==l)
                                continue;
                            int sum = arr[i][j]+arr[j][i]+arr[k][l]+arr[l][k]+arr[j][k]+arr[k][j]+arr[l][m]+arr[m][l]+arr[k][l]+arr[l][k]+arr[l][m]+arr[m][l];
                            max = Math.max(max, sum);
                        }
                    }
                }
            }
        }


        System.out.println(max);
    }
  
}

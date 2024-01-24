import java.util.Scanner;

public class B116_LittlePigsandWolves
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        char c[][] = new char[row][col];

        sc.nextLine();

        for(int i=0;i<row;i++)
        {
            c[i]=sc.nextLine().toCharArray();
        }

        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(c[i][j]=='W')
                {
                    if(j>0 && c[i][j-1]=='P')
                    {
                        count++;
                        c[i][j-1]='.';
                    }
                    else if(i>0 && c[i-1][j]=='P')
                    {
                        count++;
                        c[i-1][j]='.';
                    }
                    else if(j<col-1 && c[i][j+1]=='P')
                    {
                        count++;
                        c[i][j+1]='.';

                    }
                    else if(i<row-1 && c[i+1][j]=='P')
                    {
                        count++;
                        c[i+1][j]='.';
                    }
                }

            }
        }


        System.out.println(count);
    }
}

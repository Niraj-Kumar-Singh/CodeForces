import java.util.Scanner;

public class A510_FoxAndSnake
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        char arr[][] = new char[m][n];

        boolean last=true;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= i%2==0? '#' : '.';
            }

            if(i%2!=0)
            {
                if(last)
                {
                    arr[i][n-1]='#';
                    last=false;
                }
                else
                {
                    arr[i][0]='#';
                    last=true;
                }
            }
        }

        for(char[] c : arr)
        {
            for(char ch : c)
                System.out.print(ch);

            System.out.println();
        }

    }
  
}

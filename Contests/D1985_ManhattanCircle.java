import java.util.Scanner;

public class D1985_ManhattanCircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            getAns(sc);
        }
    }

    public static void getAns(Scanner sc)
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }

        int index = 0;
        int row=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i].charAt(j)=='#')
                {
                    index=j;
                    row = i;
                    break;
                }
            }

            if(row!=-1)
                break;
        }

        int len=0;

        int i=row;
        while(i<n && arr[i].charAt(index)=='#')
        {
            i++;
            len++;
        }

        if(len==1)
        {
            System.out.println((row+1)+" "+(index+1));
        }
        else
        {
            System.out.println((row+len/2+1)+" "+(index+1));
        }
    }
  
}

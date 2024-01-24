import java.util.Scanner;

public class A139_PetrAndBook
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int pages=sc.nextInt();

        int days[]=new int[7];

        for(int i=0;i<7;i++)
        {
            days[i]=sc.nextInt();
        }

        int index=0;

        while(pages>0)
        {
            index=index%7;
            pages-=days[index];
            index++;
        }

        System.out.println(index);
    }
  
}

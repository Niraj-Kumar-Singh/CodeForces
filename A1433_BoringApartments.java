import java.util.Scanner;

public class A1433_BoringApartments
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        sc.nextLine();


        String s = "";
        int len = 0;

        for(int i=0;i<t;i++)
        {
            s=sc.nextLine();
            len = s.length();
            ans[i]=((s.charAt(0)-'1')*10)+((len*(len+1))/2);
        }

        for(int x : ans)
            System.out.println(x);
    }
  
}

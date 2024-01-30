import java.util.Scanner;

public class A1303_ErasingZeroes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        sc.nextLine();

        String s ="";
        int arr[] = new int[t];

        for(int i=0;i<t;i++)
        {
            s=sc.nextLine();
            arr[i]=getOps(s);
        }

        for(int x : arr)
            System.out.println(x);
    }

    public static int getOps(String s)
    {
        int i=0;
        while(i<s.length() && s.charAt(i)=='0')
            i++;
        int j = s.length()-1;
        while(j>i && s.charAt(j)=='0')
            j--;

        int count=0;
        for(;i<=j;i++)
        {
            if(s.charAt(i)=='0')
                count++;
        }

        return count;
    }
  
}

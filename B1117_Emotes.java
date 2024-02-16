import java.util.Scanner;

public class B1117_Emotes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];

//        int x = sc.nextInt();
        int index=-1;
        int first=0;


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>first)
            {
                first=arr[i];
                index=i;
            }
        }
        int second=0;
        for(int i=0;i<n;i++)
        {
            if(i==index)
                continue;

            if(arr[i]>second)
                second=arr[i];
        }

//        System.out.println(first+" "+second);

        long sum = (long)k*first+second;

        int freq=m/(k+1);
        sum=sum*freq;

        m=m%(k+1);
        sum+=(long)m*first;

        System.out.println(sum);
    }
  
}

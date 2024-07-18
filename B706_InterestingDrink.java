import java.util.*;
public class B706_InterestingDrink

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x = sc.nextInt();
            System.out.println(getDays(x, arr));
        }
//        System.out.println(Arrays.toString(arr));

    }

    public static int getDays(int x, int arr[])
    {

        int start=0, end = arr.length;
        int ans=0;
        if(x<arr[0])
            return 0;

        if(x>=arr[arr.length-1])
            return arr.length;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]<=x)
                start=mid+1;
            else
                end=mid-1;
        }

        return start;
    }
}
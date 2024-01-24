public class Meesho_Q2_StockPrice
{
    public static void main(String[] args)
    {
//        int arr[]= {1,2,3,2}; // 3
//        System.out.println(getAllSubarrays(arr, 3, 2));


//        int arr[]= {4, 5, 3, 3, 1}; // 4
//        System.out.println(getAllSubarrays(arr, 5, 3));

        int arr[]= {2, 2, 1, 5, 1}; // 2
        System.out.println(getAllSubarrays(arr, 2, 1));
    }

    public static long getAllSubarrays(int arr[], int max, int min)
    {
        int n = arr.length;
        long count=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<min || max<arr[i])
                continue;

            boolean isMinPresent=false, isMaxPresent=false;

            if(arr[i]==min)
                isMinPresent=true;
            else if(arr[i]==max)
                isMaxPresent=true;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<min || max<arr[j])
                    break;

                if(arr[j]==min)
                    isMinPresent=true;
                else if(arr[j]==max)
                    isMaxPresent=true;


                if(isMaxPresent && isMinPresent)
                    count++;
            }

        }

        return count;
    }
  
}

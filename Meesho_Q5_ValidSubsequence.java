public class Meesho_Q5_ValidSubsequence
{
    public static void main(String[] args)
    {
//        int arr[] = {2,1,3,5,2};
//        int k = 2;
//        System.out.println(getMaxSubLen(arr, k));

//        int arr[] = {1,1,1};
//        int k = 0;
//        System.out.println(getMaxSubLen(arr, k));

        int arr[] = {1,2,2,1,3};
        int k = 5;
        System.out.println(getMaxSubLen(arr, k));
    }

    public static int getMaxSubLen(int arr[], int k)
    {
        int maxLen = 1;

        for(int i=0;i<arr.length;i++)
        {
            int currLen=1;
            int lastElement=arr[i];

            for(int j=i+1;j<arr.length;j++)
            {
                if((lastElement^arr[j])==k)
                {
                    lastElement=arr[j];
                    currLen++;
                }
            }

            maxLen=Math.max(maxLen, currLen);
        }

        return maxLen;
    }
  
}

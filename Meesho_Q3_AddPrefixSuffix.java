public class Meesho_Q3_AddPrefixSuffix
{
    public static void main(String[] args)
    {

//        int source[] = {1,2,2};
//        int target[] = {2,2,3};
//        System.out.println(getMinOperations(source, target));

        int source[] = {1,2,3,-1,0};
        int target[] = {3,4,3,0,4};
        System.out.println(getMinOperations(source, target));


    }

    public static int getMinOperations(int source[], int target[])
    {
        int n = source.length;
        int diff[] = new int[n];

        for(int i=0;i<n;i++)
        {
            if(target[i]<source[i])
                return -1;

            diff[i]=target[i]-source[i];
        }

        int start=0, end=n-1;
        int min = Math.min(diff[start], diff[end]);
        while(start+1<=end-1)
        {
            if(diff[start]<diff[start+1] || diff[end-1]>diff[end])
                return -1;

            start++;
            end--;
            min=Math.min(min, Math.min(diff[start], diff[end]) );
        }

        if(diff[0]==diff[n-1] && min==diff[0])
        {
                return diff[0];
        }

        return diff[0]+diff[n-1];

    }
  
}

import java.util.*;

public class Contest_1918_B
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            reduceInversions(sc, list);
        }

        for(int i=0;i<list.size();i++)
        {
            for(int x : list.get(i))
                System.out.print(x+" ");

            System.out.println();
        }
    }

    public static void reduceInversions(Scanner sc, ArrayList<int[]> list)
    {
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[]=  new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();

        reduceInversions(a, b);
        list.add(a);
        list.add(b);

    }

    public static void reduceInversions(int a[], int b[])
    {
        if(isIdentical(a, b))
        {
            Arrays.sort(a);
            Arrays.sort(b);
            return;
        }

        if(isSorted(a) || isSorted(b))
            return;

        int inv1 = numberOfInversions(a);
        int inv2 = numberOfInversions(b);

//        if(inv1>=inv2)
//            sort(a, b);
//        else
//            sort(b, a);

        int arr[] = new int[a.length];
        for(int i=0;i<a.length;i++)
            arr[i]=a[i];
        int brr[] = new int[a.length];
        for(int i=0;i<a.length;i++)
            brr[i]=b[i];

        sort(arr, brr);
        sort(b, a);

        if(numberOfInversions(arr)+numberOfInversions(brr)<numberOfInversions(a)+numberOfInversions(b))
        {
            for(int i=0;i<a.length;i++)
                a[i]=arr[i];

            for(int i=0;i<a.length;i++)
                b[i]=brr[i];
        }


    }

    public static void sort(int a[], int b[])
    {
        final int[][] res = new int[a.length][2];
        for(int i=0;i<res.length;i++)
        {
            res[i][0]=a[i];
            res[i][1]=b[i];
        }

        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        });

        for(int i=0;i<res.length;i++)
        {
            a[i]=res[i][0];
            b[i]=res[i][1];
        }

    }

    public static boolean isIdentical(int a[], int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
                return false;

        }

        return true;
    }

    public static boolean isSorted(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
                return false;
        }

        return true;
    }

    public static int numberOfInversions(int arr[])
    {
        int count=0;
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }


        return count;
    }



  
}

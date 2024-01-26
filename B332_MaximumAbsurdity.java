import java.util.ArrayList;
import java.util.Scanner;

public class B332_MaximumAbsurdity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[]=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }

        ArrayList<Long> sumList = new ArrayList<>();
        int start=1, end = k;
        long sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];
        }
        sumList.add(sum);

        while(end<n)
        {

            sum-=arr[start++];
            end++;
            sum+=arr[end];

            sumList.add(sum);
        }

//        System.out.println(sumList);
        int a=0, b=k;
        int maxIndex=0;

        for(int i=k;i<sumList.size();i++)
        {
            if(sumList.get(maxIndex)+sumList.get(i) > sumList.get(a)+sumList.get(b))
            {
                a=maxIndex;
                b=i;
            }

            if(sumList.get(maxIndex)<sumList.get(i-k+1))
            {
                maxIndex=i-k+1;
            }
        }

        System.out.println((a+1)+" "+(b+1));

        // ----------------------------------------------------


//        ArrayList<Long> sumList = new ArrayList<>();
//        int start=1, end = k;
//        long sum=0;
//        for(int i=start;i<=end;i++)
//        {
//            sum+=arr[i];
//        }
//        sumList.add(sum);
//
//        while(end<n)
//        {
//
//            sum-=arr[start++];
//            end++;
//            sum+=arr[end];
//
//            sumList.add(sum);
//        }
//
//        int a=-1, b=-1;
//        long totalSum=0;
//
//
//
//
//        System.out.println(sumList);
//        long max=0;
//        for(int i=0;i<sumList.size();i++)
//        {
//            if(sumList.get(i)>max)
//            {
//                max=sumList.get(i);
//                a=i;
//            }
//        }
//        max=0;
//        for(int i=0;i<sumList.size();i++)
//        {
////            if(k>1)
////            {
//                if(Math.abs(a-i)>=k && sumList.get(i)>max)
//                {
//                    max=sumList.get(i);
//                    b=i;
//                }
////            }
////            else if(k==1)
////            {
////                if(i!=a && sumList.get(i)>max)
////                {
////                    max=sumList.get(i);
////                    b=i;
////                }
////            }
//
//        }
//
//
//        a++;
//        b++;
//        System.out.println(Math.min(a,b)+" "+Math.max(a, b));



        // ----------------------------------------------------




    }
  
}

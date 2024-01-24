import java.util.*;

public class B352_JeffAndPeriods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr[] = new ArrayList[100001];
        int max = 0;

        for(int i=0;i<n;i++)
        {

            int x = sc.nextInt();
            max=Math.max(x, max);
            if(arr[x]==null)
                arr[x] = new ArrayList<>();
            arr[x].add(i);
        }

//        for(int i=0;i<100001;i++)
//        {
//            if(arr[i]!=null)
//                System.out.println(i + " " + arr[i].size());
//        }

        int count=0;
        ArrayList<Integer[]> ans = new ArrayList<>();
        for(int i=1;i<=max;i++)
        {
            if(arr[i]==null)
                continue;

            if(arr[i].size()==1)
            {
//                arr[i]=new ArrayList<>();
//                arr[i].add(0);
//                count++;
                ans.add(new Integer[]{i, 0});
            }
            else if(arr[i].size()==2)
            {
                int diff = arr[i].get(1)-arr[i].get(0);
//                arr[i]=new ArrayList<>();
//                arr[i].add(diff);
//                count++;
                ans.add(new Integer[]{i, diff});
            }
            else
            {
                int diff = getDiff(arr[i]);
                if(diff!=-1)
                {
//                    arr[i]=new ArrayList<>();
//                    arr[i].add(diff);
//                    count++;
                    ans.add(new Integer[]{i, diff});
                }
            }
        }

        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++)
        {
//            if(arr[i]==null || arr[i].size()>1)
//                continue;

            System.out.println(ans.get(i)[0] + " " + ans.get(i)[1]);
        }











//        int brr[]=new int[n];
//        int max = 0;
//        for(int i=0;i<n;i++)
//        {
//            brr[i]=sc.nextInt();
//            max=Math.max(brr[i], max);
//        }
//
//        int arr[][] = new int[max+1][3];
//
//        int count=0;
//
//        for(int i=0;i<n;i++)
//        {
//            int x = brr[i];
//
//
//
//            if(arr[x][0]==0)
//            {
//                arr[x][0] = x;
//                arr[x][1] = i;
//                count++;
//            }
//            else if(arr[x][0]!=-1)
//            {
//                if(arr[x][2]==0)
//                {
//                    arr[x][2]=i-arr[x][1];
//                    arr[x][1]=i;
//                }
//                else if(arr[x][2]==i-arr[x][1])
//                {
//                    arr[x][2]=i-arr[x][1];
//                    arr[x][1]=i;
//                }
//                else
//                {
//                    arr[x][0]=-1;
//                    arr[x][1]=-1;
//                    arr[x][2]=-1;
//                    count--;
//                }
//
//            }
//
////            System.out.println("i="+ i + " count="+count);
//
//        }
//
//        System.out.println(count);
//        for(int i=1;i<=max;i++)
//        {
//            if(arr[i][0]!=-1 && arr[i][0]!=0)
//                System.out.println(arr[i][0] + " " + arr[i][2]);
//        }






















    }

    public static int getDiff(ArrayList<Integer> list)
    {
        int diff = list.get(1)-list.get(0);

        for(int i=2;i<list.size();i++)
        {
            if(diff!=list.get(i)-list.get(i-1))
                return -1;
        }


        return diff;
    }
  
}

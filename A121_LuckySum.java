import java.util.ArrayList;
import java.util.Scanner;

public class A121_LuckySum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();


        long bounds[][] = new long[12][2];
        bounds[1][0]=4;
        bounds[1][1]=7;

        for(int i=2;i<12;i++)
        {
            bounds[i][0]=bounds[i-1][0]*10+4;
            bounds[i][1]=bounds[i-1][1]*10+7;
        }

        long sum=0;
        for(long i=l;i<=r;i++)
        {
            int len = Long.toString(i).length();
            if(bounds[len-1][1]<i && i<bounds[len][0])
            {
//                System.out.println(i + "->" + bounds[len][0]);
                if(r<=bounds[len][0])
                {
                    sum+=(r-i+1)*bounds[len][0];
                    break;
                }
                else
                {
                    sum+=(bounds[len][0]-i+1)*bounds[len][0];
                    i=bounds[len][0];
                }
//                sum+=bounds[len][0];
            }
            else if(bounds[len][0]<=i && i<=bounds[len][1])
            {

                if(bounds[len][0]==i)
                    sum+=bounds[len][0];
                else if(i==bounds[len][1])
                    sum+=bounds[len][1];
                else
                {
                   long num=getLucky("", len, i);

                    if(r<=num)
                    {
                        sum+=(r-i+1)*num;
                        break;
                    }
                    else
                    {
                        sum+=(num-i+1)*num;
                        i=num;
                    }
                }

//                System.out.println(i + "->" + num);
//                sum+=num;
            }
            else if(bounds[len][1]<i && i<bounds[len+1][0])
            {
//                System.out.println(i + "->" + bounds[len+1][0]);
                if(r<=bounds[len+1][0])
                {
                    sum+=(r-i+1)*bounds[len+1][0];
                    break;
                }
                else
                {
                    sum+=(bounds[len+1][0]-i+1)*bounds[len+1][0];
                    i=bounds[len+1][0];
                }
//                sum+=bounds[len+1][0];
            }
        }

        System.out.println(sum);
    }

    public static long getLucky(String ans, long len, long i)
    {
        if(ans.length()==len)
        {
            if(Long.parseLong(ans)>=i)
                return Long.parseLong(ans);
            else
                return -1;
        }

        long res = getLucky(ans+"4", len, i);

        if(res!=-1)
            return res;

        return getLucky(ans+"7", len, i);


    }





}

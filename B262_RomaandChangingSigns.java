import java.util.Scanner;

public class B262_RomaandChangingSigns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        int countNeg=0;


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
                countNeg++;
        }


        if(k>=countNeg)
        {
            int i=0;
            while(i<n && arr[i]<0)
            {
                k--;
                arr[i]*=-1;
                i++;
            }

            if(k%2!=0)
            {
                if(countNeg==0)
                    arr[0]*=-1;
                else
                {
                    if(countNeg<n) {
                        if(arr[countNeg-1]<arr[countNeg])
                            arr[countNeg-1]*=-1;
                        else
                            arr[countNeg]*=-1;
                    }
                    else
                        arr[countNeg-1]*=-1;
                }
            }


        }
        else
        {

            int i = 0;

            while(i<n && arr[i]<0 && k>0)
            {
                arr[i]*=-1;
                k--;
                i++;
            }

        }


        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        System.out.println(sum);
    }
  
}

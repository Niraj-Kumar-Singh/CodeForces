import java.util.Arrays;
import java.util.Scanner;

public class B160_UnluckyTicket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        int left[] = new int[n];
        int right[] = new int[n];

        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<n;i++)
        {
            String c1 = s.charAt(i)+"";
            String c2 = s.charAt(i+n)+"";

            left[i]=Integer.parseInt(c1);
            right[i]=Integer.parseInt(c2);

            leftSum+=left[i];
            rightSum+=right[i];
        }

        if(leftSum==rightSum)
            System.out.println("NO");
        else
        {


        boolean isInc = leftSum<rightSum;
        Arrays.sort(left);
        Arrays.sort(right);

//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));

        if(isInc)
        {
            for(int i=0;i<n;i++)
            {
                if(left[i]>=right[i])
                {
                    isInc=false;
                    System.out.println("NO");
                    break;
                }
            }

            if(isInc)
                System.out.println("YES");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(left[i]<=right[i])
                {
                    isInc=true;
                    System.out.println("NO");
                    break;
                }
            }

            if(!isInc)
                System.out.println("YES");
        }

        }




    }
  
}

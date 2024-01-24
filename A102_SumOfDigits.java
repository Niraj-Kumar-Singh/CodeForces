import java.util.Scanner;

public class A102_SumOfDigits
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int count=0;
        while(n.length()!=1)
        {
            int sum=0;
            int start=0, end = n.length()-1;

            while(start<=end)
            {
                sum+=Integer.parseInt(n.charAt(start)+"");

                if(start<end)
                    sum+=Integer.parseInt(n.charAt(end)+"");


                start++;
                end--;
            }
            n=Integer.toString(sum);
            count++;
        }

        System.out.println(count);
    }
}

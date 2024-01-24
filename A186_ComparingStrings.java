import java.util.Arrays;
import java.util.Scanner;

public class A186_ComparingStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2= sc.nextLine();

        if(s1.length()!=s2.length())
        {
            System.out.println("NO");
        }
        else
        {
            char arr1[] = s1.toCharArray();
            char arr2[] = s2.toCharArray();

//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
            int count=0;

            boolean isPossible = true;
            int last=-1;
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    count++;

                    if(last!=-1)
                    {
                        if(arr1[last]!=arr2[i] || arr1[i]!=arr2[last])
                        {
                            isPossible=false;
                            break;
                        }
                    }

                    last=i;



                }

                if(count>2)
                    break;
            }

            if(count!=2 || !isPossible)
                System.out.println("NO");
            else
                System.out.println("YES");



        }
    }
  
}

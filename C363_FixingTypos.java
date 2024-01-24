import java.util.Scanner;

public class C363_FixingTypos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int lastIndex=-1;
        boolean isLastDouble = false;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                char c = arr[i];
                int j=i+1;
                if(isLastDouble)
                {
                    j=i;
                    isLastDouble=false;
                }
                else
                    isLastDouble=true;


                while(j<arr.length && c==arr[j])
                {
                    arr[j]='_';
//                    lastIndex=j;
                    j++;
                }

                i=j;
            }
            else if(isLastDouble)
                isLastDouble=false;

        }
//        abbbbbccbbbbbbbccccbbbbzbbbbbccbbbbbbbccccbbbbxybbbbbccbbbbbbbccccbbbb
//        abbcbbcccbbbzbbbcbbcccbbbxybbbcbbcccbbb


        String ans = "";

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='_')
                ans+=arr[i];
        }

        System.out.println(ans);
    }
  
}

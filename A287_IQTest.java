import java.util.Scanner;

public class A287_IQTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char arr[][]=new char[4][4];
        for(int i=0;i<4;i++)
        {
            String s = sc.next();
            arr[i]=s.toCharArray();
        }

        boolean isPossible=false;
        for(int i=0;i<3;i++)
        {

            for(int j=0;j<3;j++)
            {
                int type1=0;
                int type2=0;


                if(arr[i][j]=='#')
                    type1++;
                else
                    type2++;

                if(arr[i][j+1]=='#')
                    type1++;
                else
                    type2++;

                if(arr[i+1][j]=='#')
                    type1++;
                else
                    type2++;

                if(arr[i+1][j+1]=='#')
                    type1++;
                else
                    type2++;

                if(type1>=3 || type2>=3)
                {
//                    System.out.println("At i=" + i + " and j= "+ j + " type1="+type1 + " type2="+type2);
                    isPossible=true;
                    break;
                }

            }

            if(isPossible)
                break;
        }


        if(isPossible)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

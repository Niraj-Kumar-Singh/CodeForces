import java.util.Scanner;

public class A320_MagicNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

//        int count1=0;
        int count4=0;

        boolean isMagic=true;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);



            if(c=='4')
            {
//                count1=0;
                if(i==0)
                {
                    isMagic=false;
                    break;
                }
                count4++;
            }
            else if(c=='1')
            {
                count4=0;
//                count1++;
            }
            else
            {
                isMagic=false;
                break;
            }


            if(count4>2)
            {
                isMagic=false;
                break;
            }
        }


        if(isMagic)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
  
}

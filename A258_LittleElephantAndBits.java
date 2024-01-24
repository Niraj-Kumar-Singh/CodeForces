import java.util.Scanner;

public class A258_LittleElephantAndBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int index=0;
        while(index<s.length()-1 && s.charAt(index)=='1')
            index++;

        System.out.println(s.substring(0, index)+s.substring(index+1, s.length()));
    }
  
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class CodeforcesRound917_B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();


            getCombinations(s, hs);

//            System.out.println(s);

            System.out.println(hs.size());
            hs.clear();
        }
    }

    public static void getCombinations(String s, HashSet<String> hs)
    {
//        hs.add(s);
//        for(int i=1;i<s.length();i++)
//        {
//            hs.add(s.substring(i,s.length()));
//        }
//
//        Iterator<String> it = hs.iterator();
//
//        ArrayList<String> arr = new ArrayList<>(hs.size());
//
//        while(it.hasNext())
//        {
//            arr.add(it.next());
//        }
//
//        for(int i=0;i<arr.size();i++)
//        {
//
//            String s1 = arr.get(i);
//            if(s1.length()>1)
//            {
//                String s2 = s1.charAt(0) + s1.substring(2, s1.length());
//                hs.add(s2);
//            }
//
//        }





        if(s.length()==1)
        {
            hs.add(s);
            return;
        }


        hs.add(s);

        String s1 = s.substring(1, s.length());
        if(!hs.contains(s1))
            getCombinations(s1, hs);

        String s2 = s.charAt(0)+s.substring(2, s.length());
        if(!hs.contains(s2))
            getCombinations(s2, hs);



    }



  
}

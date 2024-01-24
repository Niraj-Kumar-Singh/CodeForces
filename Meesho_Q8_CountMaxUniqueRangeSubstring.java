import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Meesho_Q8_CountMaxUniqueRangeSubstring
{
    public static void main(String[] args)
    {

        String s = "abcde";
        int minLen = 2;
        int maxLen = 3;
        int maxUnique = 3;
        System.out.println(countSubstrings(s, minLen, maxLen, maxUnique));

//        String s = "ababab";
//        int minLen = 2;
//        int maxLen = 3;
//        int maxUnique = 4;
//        System.out.println(countSubstrings(s, minLen, maxLen, maxUnique));
    }

    public static int countSubstrings(String s, int minLen, int maxLen, int maxUnique)
    {
        int count = 0;
        int distinct = 0;
        boolean[] have = new boolean[26];
        HashMap<String, Integer> hm = new HashMap<>();

        for(int length=minLen;length<=maxLen;length++)
        {
            int[] freq = new int[26];
            int windowStart=0, windowEnd = length-1;

            for(int i=windowStart;i<=windowEnd;i++)
            {
                freq[s.charAt(i)-'a']++;
            }

            while(windowEnd<s.length())
            {

                if (haveSameFrequency(freq, maxUnique))
                {
                    String s1 = s.substring(windowStart, windowEnd+1);
//                    System.out.println(s1);
//                    count=Math.max(count, x);
                    hm.put(s1, hm.getOrDefault(s1,0)+1);
                }

                freq[s.charAt(windowStart)-'a']--;
                windowStart++;
                windowEnd++;

                if (windowEnd < s.length())
                {
                    freq[s.charAt(windowEnd)-'a']++;
                }
            }

        }
        for(Map.Entry<String, Integer> entry : hm.entrySet())
        {
            count=Math.max(entry.getValue(), count);
        }

        return count;
    }

    public static boolean haveSameFrequency(int freq[], int k)
    {
        int max=1;
        for (int i = 0; i < 10; i++)
        {
            if (freq[i] != 0 && freq[i] > k)
                return false;
            
            max=Math.max(max, freq[i]);
        }
        return true;
    }
  
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Meesho_Q7_CountSubstringsWithKOccurences
{
    public static void main(String[] args)
    {
        String input = "1102021222";
        int k = 2;

        int result = countSubstringsWithKOccurrences(input, k);
        System.out.println(result);


    }

    public static int countSubstringsWithKOccurrences(String s, int k)
    {
        int count = 0;
        int distinct = 0;
        boolean[] have = new boolean[10];
        Arrays.fill(have, false);
        for (int i = 0; i < s.length(); i++) {
            have[Integer.parseInt(s.charAt(i)+"")] = true;
        }
//        System.out.println("have array="+Arrays.toString(have));
        for (int i = 0; i < 10; i++) {
            if (have[i]) {
                distinct++;
            }
        }

        System.out.println("distinct="+distinct);
        for (int length = 1; length <= distinct; length++) {
            int window_length = length * k;
            int[] freq = new int[10];
            Arrays.fill(freq, 0);
            int window_start = 0;
            int window_end= window_start + window_length - 1;
            for (int i = window_start;i <= Math.min(window_end, s.length() - 1);i++)
            {
                freq[Integer.parseInt(s.charAt(i)+"")]++;
            }
//            System.out.println("Freq Array for length-"+ length*k + Arrays.toString(freq));
            while (window_end < s.length())
            {
                if (have_same_frequency(freq, k))
                {
//                    System.out.println(s.substring(window_start, window_end+1));
                    count++;
                }
                freq[Integer.parseInt(s.charAt(window_start)+"")]--;
                window_start++;
                window_end++;
                if (window_end < s.length()) {
                    freq[Integer.parseInt(s.charAt(window_end)+"")]++;
                }
            }
        }
        return count;
    }

    public static boolean have_same_frequency(int[] freq, int k)
    {
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0 && freq[i] != k) {
                return false;
            }
        }
        return true;
    }
  
}

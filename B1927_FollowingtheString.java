import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class B1927_FollowingtheString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans[] = new StringBuilder[t];

        for(int i=0;i<t;i++)
        {
            ans[i]=getString(sc);
        }

        for(StringBuilder s : ans)
        {
            System.out.println(s);
        }
    }

    public static StringBuilder getString(Scanner sc)
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        char ch='a';
        StringBuilder ans = new StringBuilder();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                ans.append(ch);
                ch++;
                hm.put(ch, hm.getOrDefault(ch, 0)+1);
            }
            else
            {
                for(char j='a';j<='z';j++)
                {
                    System.out.println(j);
                    if(hm.get(j)==arr[i])
                    {
                        ans.append(j);
                        hm.put(j, hm.get(j)+1);
                        break;
                    }
                }
            }
        }

        return ans;
    }
  
}

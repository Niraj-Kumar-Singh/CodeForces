public class Meesho_Q1_SumOfAllPossibleValue
{
    public static void main(String[] args)
    {
        String s ="123";

        getSum(s, s.length());

    }

    public static void getSum(String S, int N)
    {
        long sumOfExp = 0;

        for (int i = 0; i < Math.pow(2, N - 1); i++)
        {

            long ans_sub = 0;

            String subst = "" + S.charAt(0);

            for (int j = 0; j < N - 1; j++)
            {

                if (((i >> j) & 1) == 1)
                {
                    ans_sub += Long.parseLong(subst);
                    subst = "" + S.charAt(j + 1);
                }
                else
                    subst += S.charAt(j + 1);

                if (j == N - 2)
                    ans_sub += Long.parseLong(subst);
            }

            sumOfExp += ans_sub;
        }

        if (N == 1)
            System.out.println(S);
        else
            System.out.println(sumOfExp);
    }
  
}

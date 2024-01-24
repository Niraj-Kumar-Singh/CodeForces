import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class IBM_Q1_SortDates
{
    public static void main(String[] args)
    {
        String[] dates = {"01 Mar 2017", "03 Feb 2017", "15 Jan 1998" , "31 Dec 1895"};

        String ans[] = sortDates(dates);

        for(String s : ans)
        {
            System.out.print(s +"  ");
        }
    }

    public static String[] sortDates(String dates[])
    {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Jan", 1);
        hm.put("Feb", 2);
        hm.put("Mar", 3);
        hm.put("Apr", 4);
        hm.put("May", 5);
        hm.put("Jun", 6);
        hm.put("Jul", 7);
        hm.put("Aug", 8);
        hm.put("Sep", 9);
        hm.put("Oct", 10);
        hm.put("Nov", 11);
        hm.put("Dec", 12);

        String dt[][] = new String[dates.length][3];

        for(int i=0;i<dt.length;i++)
        {
            dt[i] = dates[i].split(" ");
        }

        Arrays.sort(dt, new Comparator<String[]>(){
            public int compare(final String o1[], String o2[])
            {
                int d1 = Integer.parseInt(o1[0]), d2=Integer.parseInt(o2[0]);
                int m1 = hm.get(o1[1]), m2 = hm.get(o2[1]);
                int y1 = Integer.parseInt(o1[2]), y2 = Integer.parseInt(o2[2]);

                if(y1==y2)
                {
                    if(m1==m2)
                    {
                        return d1-d2;
                    }
                    else
                        return m1-m2;
                }
                else return y1-y2;
            }
        });


        String ans [] = new String[dates.length];

        for(int i=0;i<dt.length;i++)
        {
            String res = dt[i][0]+" "+dt[i][1]+" "+dt[i][2];

            ans[i]=res;
        }

        return ans;



    }
  
}

import java.util.*;

public class A342_XeniaAndDivisors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            max=Math.max(max, arr[i]);

            if(hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i])+1);
            else
                hm.put(arr[i], 1);
        }

//        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
//            System.out.println(entry.getKey() + " ->" + entry.getValue());

        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            int a = arr[i];
            if(hm.containsKey(a))
            {
                int x = 2;
                while (a * x <= max)
                {
                    boolean found = false;
                    if (hm.containsKey(a * x))
                    {
                        int b = a * x;

                        int y = 2;
                        while (b * y <= max)
                        {
                            if (hm.containsKey(b * y))
                            {
                                ArrayList<Integer> list = new ArrayList<>();
                                list.add(a);
                                list.add(b);
                                list.add(b * y);

//                                System.out.println(a + " " + hm.get(a));

                                if (hm.get(a) > 1)
                                    hm.put(a, hm.get(a) - 1);
                                else
                                    hm.remove(a);

                                if (hm.get(b) > 1)
                                    hm.put(b, hm.get(b) - 1);
                                else
                                    hm.remove(b);

                                if (hm.get(b * y) > 1)
                                    hm.put(b * y, hm.get(b * y) - 1);
                                else
                                    hm.remove(b * y);

                                ans.add(list);

                                found = true;
                                break;
                            }

                            y++;
                        }

                    }

                    if (found)
                        break;

                    x++;
                }
            }
        }

        if(ans.size()!=n/3)
            System.out.println(-1);
        else
        {
            for(ArrayList<Integer> list : ans)
                System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
        }


    }
  
}

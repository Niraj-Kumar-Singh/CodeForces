/*********** Code with INPUT FILE(input.txt) and OUTPUT FILE(output.txt)  *******************/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A254_CardsWithNumbers {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[2 * n];

            ArrayList<Integer[]> list = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < 2 * n; i++) {
                if (hm.containsKey(arr[i])) {
                    Integer t[] = new Integer[2];
                    t[0] = i + 1;
                    t[1] = hm.get(arr[i]);
                    list.add(t);

                    hm.remove(arr[i]);
                } else {
                    hm.put(arr[i], i + 1);
                }
            }

            if (list.size() != n) {
                bw.write("-1\n");
            } else {
                for (int i = 0; i < n; i++) {
                    bw.write(list.get(i)[0] + " " + list.get(i)[1] + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}













/************ Code with STANDARD I/O ********************/


//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class A254_CardsWithNumbers
//{
//    public static void main(String[] args)
//    {
//        Scanner sc= new Scanner(System.in);
//
//        int n=sc.nextInt();
//        int arr[]=new int[2*n];
//
//        ArrayList<Integer[]> list = new ArrayList<>();
//        HashMap<Integer, Integer> hm = new HashMap<>();
//
//        for(int i=0;i<2*n;i++)
//        {
//            arr[i]=sc.nextInt();
//
//            if(hm.containsKey(arr[i]))
//            {
//                Integer t[] = new Integer[2];
//                t[0]=i+1;
//                t[1]=hm.get(arr[i]);
//                list.add(t);
//
//                hm.remove(arr[i]);
//            }
//            else
//            {
//                hm.put(arr[i], i+1);
//            }
//        }
//
//        if(list.size()!=n)
//        {
//            System.out.println(-1);
//        }
//        else
//        {
//            for(int i=0;i<n;i++)
//            {
//                System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
//            }
//        }
//    }
//
//}


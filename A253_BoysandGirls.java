import java.io.*;
import java.util.Scanner;

public class A253_BoysandGirls
{
    public static void main(String[] args)
    {
        String inputFilePath = "input.txt";
        String outputFIlePath = "output.txt";
        try
        {//        Scanner sc = new Scanner(System.in);

    //        int n = sc.nextInt();
    //        int m = sc.nextInt();

    //        int min = Math.min(n, m);
    //        int max = Math.max(n, m);
    //
    //        int rem = max-min;
    //        int front = rem/2;
    //        int back =rem-front;

            FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputFIlePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = bufferedReader.readLine();

            String numbers[] = line.split(" ");

            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

                String ans = "";

                if (n >= m)
                {
//                    int front = (n - m) / 2;
//                    while (front > 0) {
//                        ans += "B";
//                        front--;
//                    }

                    int back = n - m;

                    while (m > 0) {
                        ans += "BG";
                        m--;
                    }

                    while (back > 0) {
                        ans += "B";
                        back--;
                    }

                } else
                {
//                    int front = (m - n) / 2;
//                    while (front > 0) {
//                        ans += "G";
//                        front--;
//                    }

                    int back = m - n;

                    while (n > 0) {
                        ans += "GB";
                        n--;
                    }

                    while (back > 0) {
                        ans += "G";
                        back--;
                    }
                }

//                System.out.println(ans);

            bufferedWriter.write(ans);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(IOException | NumberFormatException e)
        {
            e.printStackTrace();

        }
    }
  
}

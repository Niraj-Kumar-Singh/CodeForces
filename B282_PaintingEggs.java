import java.util.Scanner;

public class B282_PaintingEggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        sc.close();

        int sumA = 0, sumB = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (Math.abs((sumA + arr[i][0]) - sumB) <= 500) {
                sumA += arr[i][0];
                ans.append("A");
            } else if (Math.abs((sumB + arr[i][1]) - sumA) <= 500) {
                sumB += arr[i][1];
                ans.append("G");
            } else {
                ans = new StringBuilder("-1");
                break;
            }
        }

        System.out.println(ans.toString());
    }
}

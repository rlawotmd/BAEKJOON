import java.util.Scanner;

public class BAEKJOON2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k, n;
        int[][] arr = new int[15][15];

        for(int i = 0; i < 15; i++) {
            arr[i][1] = 1;
        }

        for(int i = 0; i < 15; i++) {
            if (i == 0) {
                for (int j = 1; j < 15; j++) {
                    arr[i][j] = arr[i][j - 1] + 1;
                }
            } else {
                for (int j = 1; j < 15; j++) {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}

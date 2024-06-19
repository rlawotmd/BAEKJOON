import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON16935 {
    static int[][] arr;

    static void first() {
        int[][] copy_arr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[arr.length - i - 1][j];
            }
        }
        arr = copy_arr;
    }

    static void second() {
        int[][] copy_arr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[i][arr[0].length - j - 1];
            }
        }
        arr = copy_arr;
    }

    static void third() {
        int[][] copy_arr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy_arr[j][i] = arr[arr.length - i - 1][j];
            }
        }
        arr = copy_arr;
    }

    static void fourth() {
        int[][] copy_arr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy_arr[j][i] = arr[i][arr[0].length - j - 1];
            }
        }
        arr = copy_arr;
    }

    static void fifth() {
        int[][] copy_arr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length / 2; i++) { // 1
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[i][j - arr[0].length / 2];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) { // 2
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[i - arr.length / 2][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) { // 3
            for (int j = 0; j < arr[0].length / 2; j++) {
                copy_arr[i][j] = arr[i][j + arr[0].length / 2];
            }
        }
        for (int i = 0; i < arr.length / 2; i++) { // 4
            for (int j = 0; j < arr[0].length / 2; j++) {
                copy_arr[i][j] = arr[i + arr.length / 2][j];
            }
        }
        arr = copy_arr;

    }

    static void sixth() {
        int[][] copy_arr = new int[arr.length][arr[0].length];

        for (int i = arr.length / 2; i < arr.length; i++) { // 1
            for (int j = 0; j < arr[0].length / 2; j++) {
                copy_arr[i][j] = arr[i - arr.length / 2][j];
            }
        }
        for (int i = 0; i < arr.length / 2; i++) { // 2
            for (int j = 0; j < arr[0].length / 2; j++) {
                copy_arr[i][j] = arr[i][j + arr[0].length / 2];
            }
        }
        for (int i = 0; i < arr.length / 2; i++) { // 3
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[i + arr.length / 2][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) { // 4
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                copy_arr[i][j] = arr[i][j - arr[0].length / 2];
            }
        }
        arr = copy_arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) first();
            else if (num == 2) second();
            else if (num == 3) third();
            else if (num == 4) fourth();
            else if (num == 5) fifth();
            else if (num == 6) sixth();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}

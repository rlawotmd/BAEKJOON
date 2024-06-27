import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BAEKJOON2630 {
    final int[] di = {1, 0, -1, 0}, dj = {0, 1, 0, -1};
    static int blue_cnt, white_cnt, n;
    static int[][] a;
    static boolean[][] v;

    static void div(int s, int e, int n) {
        int c = a[s][e];
        boolean key = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (c != a[s + i][e + j]) {
                    key = false;
                    break;
                }
            }
            if (!key) break;
        }
        if (key) {
            if (c == 0) white_cnt++;
            else blue_cnt++;
        } else {
            // 1사
            div(s, e, n / 2);
            // 2사
            div(s + n / 2, e, n / 2);
            // 3사
            div(s + n / 2, e + n / 2, n / 2);
            // 4사
            div(s, e + n / 2, n / 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        blue_cnt = 0;
        white_cnt = 0;

        n = Integer.parseInt(br.readLine());

        a = new int[n][n];
        v = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(0, 0, n);

        System.out.println(white_cnt);
        System.out.println(blue_cnt);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON14889 {
    static int[][] a;
    static boolean[][] v;
    static int max_cnt = 0;
    static final int[] around_i = {1, 0, -1, 0};
    static final int[] around_j = {0, 1, 0, -1};

    static void dfs(int i, int j, int t) {
        v[i][j] = false;
        for (int d = 0; d < 4; d++) {
            int di = i + around_i[d];
            int dj = j + around_j[d];
            if (0 <= di && di < a.length && 0 <= dj && dj < a.length && a[di][dj] > t && v[di][dj]) {
                dfs(di, dj, t);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        a = new int[n][n];
        v = new boolean[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, a[i][j]);
                v[i][j] = true;
            }
        }

        for (int t = -1; t < max; t++) {
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] > t && v[i][j]) {
                        cnt++;
                        dfs(i, j, t);
                    }
                }
            }

            max_cnt = Math.max(cnt, max_cnt);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    v[i][j] = true;
                }
            }
        }

        System.out.println(max_cnt);





    }
}

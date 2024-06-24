import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BAEKJOON4963 {
    static final int[] around_i = {1, 1, 0, -1, -1, -1, 0, 1};
    static final int[] around_j = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] a;
    static boolean[][] v;
    static ArrayDeque<int[]> q;
    static int cnt, n, m;

    static void dfs(int i, int j) {
        v[i][j] = false;

        for (int k = 0; k < 8; k++) {
            int ai = i + around_i[k];
            int aj = j + around_j[k];
            if (0 <= ai && ai < m && 0 <= aj && aj < n && v[ai][aj] && a[ai][aj] == 1) {
                dfs(ai, aj);
            }
        }
    }

    static void bfs(int i, int j) {
        q = new ArrayDeque<>();
        q.offer(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] d = q.poll();
            i = d[0];
            j = d[1];
            if (!v[i][j]) continue;
            v[i][j] = false;
            for (int k = 0; k < 8; k++) {
                int ai = i + around_i[k];
                int aj = j + around_j[k];
                if (0 <= ai && ai < m && 0 <= aj && aj < n && v[ai][aj] && a[ai][aj] == 1) {
                    q.offer(new int[]{ai, aj});
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        while (n != 0 && m != 0) {
            cnt = 0;
            a = new int[m][n];
            v = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                    if (a[i][j] == 1) v[i][j] = true;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (v[i][j] && a[i][j] == 1) {
                        cnt++;
//                        dfs(i, j);
                        bfs(i, j);
                    }
                }
            }

            bw.write(cnt + "\n");

            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }

        bw.flush();
    }
}

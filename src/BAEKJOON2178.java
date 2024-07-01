import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BAEKJOON2178 {
    static int[][] a;
    static boolean[][] v;
    static int n, m, min = Integer.MAX_VALUE;
    static int[] di = {1, 0, -1, 0};
    static int[] dj = {0, 1, 0, -1};

    static void BFS(int x, int y) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + di[i];
                int ny = cur[1] + dj[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && a[nx][ny] == 1 && !v[nx][ny]) {
                    v[nx][ny] = true;
                    a[nx][ny] = a[cur[0]][cur[1]] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        v = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) s.charAt(j) - '0';
            }
        }

        BFS(0, 0);

        System.out.println(a[n - 1][m - 1]);
    }
}

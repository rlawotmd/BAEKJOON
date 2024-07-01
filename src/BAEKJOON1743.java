// BFS
// DFS

import java.io.*;
import java.util.*;

public class BAEKJOON1743 {
    static int[][] a;
    static boolean[][] v;
    static int n, m, k, max = 0;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int size; // DFS

    static void BFS(int x, int y) {
        int size = 0;
        v[x][y] = true;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            size++;
            int[] c = q.poll();
            for (int i = 0; i < 4; i++) {
                int dx = c[0] + di[i];
                int dy = c[1] + dj[i];
                if (dx < 0 || dy < 0 || dx >= n || dy >= m || v[dx][dy] || a[dx][dy] != 1) continue;
                v[dx][dy] = true;
                q.offer(new int[]{dx, dy});
            }
        }
        max = Math.max(max, size);
    }

    static void DFS(int x, int y) {
        v[x][y] = true;
        size++;
        for (int i = 0; i < 4; i++) {
            int dx = x + di[i];
            int dy = y + dj[i];
            if (dx < 0 || dy < 0 || dx >= n || dy >= m || v[dx][dy] || a[dx][dy] != 1) continue;
            DFS(dx, dy);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        v = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] || a[i][j] != 1) continue;
                size = 0;
                DFS(i, j);
                max = Math.max(max, size);
//                BFS(i, j);
            }
        }

        System.out.println(max);
    }
}
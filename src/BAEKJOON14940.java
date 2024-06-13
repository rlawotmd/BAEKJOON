import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON14940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int[][] ans = new int[n][m];
        Boolean[][] visited = new Boolean[n][m];
        int start_x = 0, start_y = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                visited[i][j] = false;
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1)
                    visited[i][j] = true;
                if (arr[i][j] == 2) {
                    start_x = i;
                    start_y = j;
                    visited[i][j] = false;
                }
            }
        }

        Queue<int[]> q = new LinkedList<>();
        int[] check_x = {0, 1, 0, -1};
        int[] check_y = {1, 0, -1, 0};

        q.add(new int[]{start_x, start_y});
        while (!q.isEmpty()) {
            int[] loc = q.remove();
            int x = loc[0];
            int y = loc[1];
            int max = 0;
            for (int i = 0; i < 4; i++) {
                int nx = x + check_x[i];
                int ny = y + check_y[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                max = Math.max(max, ans[nx][ny]);
                if (!visited[nx][ny] || arr[nx][ny] == 0) continue;
                q.add(new int[]{nx, ny});
                visited[nx][ny] = false;
            }
            ans[x][y] = max + 1;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) bw.write(-1 + " ");
                else if (ans[i][j] == 0) bw.write(0 + " ");
                else bw.write((ans[i][j] - 1)+ " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}

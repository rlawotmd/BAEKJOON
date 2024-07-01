import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON1189 {
    static int[][] a;
    static boolean[][] v;
    static int[] di = {1, 0, -1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int cnt = 0, r ,c , k;

    static void DFS(int x, int y) {
        if (x == 0 && y == c - 1 && a[x][y] == k) {
            cnt++;
            return;
        }
        v[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + di[i];
            int ny = y + dj[i];
            if (nx >= 0 && ny >= 0 && nx < r && ny < c && !v[nx][ny] && a[nx][ny] != -1) {
                a[nx][ny] = a[x][y] + 1;
                DFS(nx, ny);
            }
        }
        v[x][y] = false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        a = new int[r][c];
        v =  new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                char c = s.charAt(j);
                if (c == 'T') a[i][j] = -1;
                else a[i][j] = 1;
            }
        }

        DFS(r - 1, 0);

        System.out.println(cnt);

    }
}

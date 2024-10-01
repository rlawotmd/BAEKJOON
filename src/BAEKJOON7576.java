import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON7576 {

    static final int[] x = {1, 0, -1, 0};
    static final int[] y = {0, -1, 0, 1};

    static boolean check(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        boolean[][] v = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int date = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.add(new int[]{i, j});
                    v[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            date++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.remove();
                for (int j = 0; j < 4; j++) {
                    int xi = cur[0] + x[j];
                    int yi = cur[1] + y[j];
                    if (xi < 0 || yi < 0 || xi >= n || yi >= m) continue;
                    if (arr[xi][yi] == -1) continue;
                    if (v[xi][yi]) continue;
                    v[xi][yi] = true;
                    arr[xi][yi] = 1;
                    q.add(new int[]{xi, yi});
                }
            }
        }

        if (!check(arr)) System.out.println(-1);
        else System.out.println(date);

    }
}

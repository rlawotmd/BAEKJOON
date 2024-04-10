import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON1926 {
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        boolean[][] check = new boolean[n][m];
        int[] x_around = {1, 0, -1, 0};
        int[] y_around = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) check[i][j] = true;
                else check[i][j] = false;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 || !check[i][j]) continue;
                int area = 1;
                count++;
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i, j});
                while (!q.isEmpty()) {
                    int[] loc = q.remove();
                    int loc_x = loc[0];
                    int loc_y = loc[1];
                    check[loc_x][loc_y] = false;

                    for (int k = 0; k < 4; k++) {
                        int check_x = loc_x + x_around[k];
                        int check_y = loc_y + y_around[k];
                        if (check_x < 0 || check_y < 0 || check_x == n || check_y == m) continue;
                        if (arr[check_x][check_y] == 1 && check[check_x][check_y]) {
                            q.add(new int[]{check_x, check_y});
                            area++;
                            check[check_x][check_y] = false;
                        }

                    }
                    if (area > max) max = area;

                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}

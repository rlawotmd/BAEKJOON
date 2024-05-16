import java.io.*;
import java.util.*;

public class BAEKJOON1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[] around_x = {0, 1, 0, -1};
        int[] around_y = {1, 0, -1, 0};
        for (int test = 0; test < t; test++) {
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[m][n];
            Boolean[][] check = new Boolean[m][n];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
                check[x][y] = true;
            }
            Stack<int[]> s = new Stack<>();
            int count = 0;
            for  (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] != 1 || !check[i][j]) continue;
                    count++;
                    s.push(new int[]{i, j});
                    while(!s.isEmpty()) {
                        int[] check_loc = s.pop();
                        int loc_x = check_loc[0];
                        int loc_y = check_loc[1];
                        check[loc_x][loc_y] = false;
                        for (int d = 0; d < 4; d++) {
                            int check_x = loc_x + around_x[d];
                            int check_y = loc_y + around_y[d];
                            if ((check_x < 0 || check_x >= m) || (check_y < 0 || check_y >= n)) continue;
                            if (arr[check_x][check_y] == 1 && check[check_x][check_y]) {
                                s.push(new int[]{check_x, check_y});
                            }
                        }
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}

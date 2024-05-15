import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Boolean[] check = new Boolean[n + 1];
        Arrays.fill(check, true);

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!check[i]) continue;
            count++;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            while (!q.isEmpty()) {
                int num = q.remove();
                if (!check[num]) continue;
                check[num] = false;
                for (int j = 1; j <= n; j++) {
                    if (arr[num][j] == 1 && check[j]) {
                        q.add(j);
                    }
                }
            }
        }
        System.out.println(count);
    }
}

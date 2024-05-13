import java.io.*;
import java.util.*;

public class BAEKJOON1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        boolean[] D_check = new boolean[n + 1];
        boolean[] B_check = new boolean[n + 1];
        Arrays.fill(D_check, true);
        Arrays.fill(B_check, true);

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            arr[from][to] = 1;
            arr[to][from] = 1;
        }

        s.push(v);
        q.add(v);

        while (!s.isEmpty()) {
            int num = s.pop();
            if (!D_check[num]) continue;
            bw.write(num + " ");
            D_check[num] = false;
            for (int i = n; i >= 1; i--) {
                if (arr[num][i] == 1 && D_check[i]) {
                    s.push(i);
                }
            }
        }
        bw.write("\n");

        while (!q.isEmpty()) {
            int num = q.remove();
            if (!B_check[num]) continue;
            bw.write(num + " ");
            B_check[num] = false;
            for (int i = 1; i <= n; i++) {
                if (arr[num][i] == 1 && B_check[i]) {
                    q.add(i);
                }
            }
        }

        bw.flush();
    }
}
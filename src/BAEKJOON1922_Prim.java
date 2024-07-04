import java.io.*;
import java.util.*;

public class BAEKJOON1922_Prim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<int[]>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        boolean[] v = new boolean[n];
        int[] w = new int[n];
        Arrays.fill(w, Integer.MAX_VALUE);
        w[0] = 0;
        int sum = 0, cnt = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            g[from - 1].add(new int[] {to - 1, cost});
            g[to - 1].add(new int[] {from - 1, cost});
        }

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mv = -1;
            for (int j = 0; j < n; j++) {
                if (!v[j] && min > w[j]) {
                    min = w[j];
                    mv = j;
                }
            }
            v[mv] = true;
            sum += min;
            if (cnt++ == n - 1) break;

            for (int[] j : g[mv]) {
                if (!v[j[0]] && w[j[0]] > j[1]) {
                    w[j[0]] = j[1];
                }
            }
        }
        System.out.println(sum);
    }
}

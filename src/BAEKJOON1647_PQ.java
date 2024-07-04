import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BAEKJOON1647_PQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<int[]>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));
        boolean[] v = new boolean[n];
        int[] w = new int[n];
        Arrays.fill(w, Integer.MAX_VALUE);
        w[0] = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (cost == 0) continue;
            g[from - 1].add(new int[] {to - 1, cost});
            g[to - 1].add(new int[] {from - 1, cost});
        }

        int sum = 0, cnt = 0;
        pq.offer(new int[] {0, w[0]});
        while (!pq.isEmpty()) {
            int[] vc = pq.poll();
            int min = vc[1];
            int minVertex = vc[0];
            if (v[minVertex]) continue;

            v[minVertex] = true;
            if (cnt++ == n - 1) break;

            for (int[] j : g[minVertex]) {
                if (!v[j[0]] && w[j[0]] > j[1]) {
                    w[j[0]] = j[1];
                    pq.offer(new int[] {j[0], w[j[0]]});
                }
            }
        }
        int max = 0;
        for (int i : w) {
            max = Math.max(max, i);
            sum += i;
        }
        System.out.println(sum - max);

    }
}
/*
4 3
1 2 1
2 3 100
3 4 1
ans : 2
 */

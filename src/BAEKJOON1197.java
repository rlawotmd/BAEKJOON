import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1197 {
    static int n, m, ans = 0;
    static int[] p;
    static int[][] g;

    static int find(int a) {
        if (p[a] == a) return a;
        return p[a] = find(p[a]);
    }

    static boolean union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        if (aRoot != bRoot) {
            p[bRoot] = aRoot;
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }

        g = new int[m][3];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            g[i][0] = Integer.parseInt(st.nextToken());
            g[i][1] = Integer.parseInt(st.nextToken());
            g[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(g, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        int cnt = 1;

        for (int[] i : g) {
            if (union(i[0], i[1])) {
                ans += i[2];
                if (++cnt == n) break;
            }
        }

        System.out.println(ans);

    }
}

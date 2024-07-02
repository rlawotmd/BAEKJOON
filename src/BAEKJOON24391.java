import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON24391 {
    static int n, m, cnt = 0;
    static int[] a;

    static int find(int b) {
        if (a[b] == b) return b;
        return a[b] = find(a[b]);
    }

    static void union(int b1, int b2) {
        int Root1 = find(b1);
        int Root2 = find(b2);
        if (Root1 != Root2) a[Root2] = Root1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n + 1];

        for (int i = 1; i <= n; i++) a[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int b1 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());
            union(b1, b2);
        }

        st = new StringTokenizer(br.readLine(), " ");
        int b1 = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int b2 = Integer.parseInt(st.nextToken());
            if (find(b1) != find(b2)) cnt++;
            b1 = b2;
        }

        System.out.println(cnt);
    }
}

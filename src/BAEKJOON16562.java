import java.io.*;
import java.util.*;

public class BAEKJOON16562 {
    static int n, m, k, ans = 0;
    static int[] p, money[];
    static boolean[] v;

    static int find(int a) {
        if (p[a] == a) return a;
        return p[a] = find(p[a]);
    }

    static void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        if (aRoot != bRoot) {
            p[bRoot] = aRoot;
            money[aRoot][1] = Math.min(money[aRoot][1], money[bRoot][1]);
            money[bRoot][1] = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        p = new int[n + 1];
        for (int i = 0; i <= n; i++) p[i] = i;
        v = new boolean[n + 1];
        money = new int[n + 1][2];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            money[i][0] = i;
            money[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i <= n; i++) {
            ans += money[i][1];
        }

        if (ans > k) System.out.println("Oh no");
        else System.out.println(ans);

    }
}
/*
5 5 100
40 40 30 40 50
1 2
2 3
4 5
3 4
5 1
ans : 30
 */
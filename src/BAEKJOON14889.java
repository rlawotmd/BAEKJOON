import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON14889 {
    static int[][] a;
    static int[] s, l, all;
    static boolean[] v;
    static int n, sT, lT;
    static int min = Integer.MAX_VALUE;

    static void subTeam(int cnt, int start) {
        if (cnt == n / 2) {
            int p = 0;
            sT = 0; lT = 0;
            for (int i = 0; i < n; i++) {
                if (v[i]) continue;
                l[p++] = all[i];
            }

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    sT += a[s[i]][s[j]];
                    lT += a[l[i]][l[j]];
                }
            }

            min = Math.min(min, (Math.max(sT, lT) - Math.min(sT, lT)));
            return;
        }
        for (int i = start; i < n; i++) {
            if (v[i]) continue;
            v[i] = true;
            s[cnt] = all[i];
            subTeam(cnt + 1, i + 1);
            v[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];
        all = new int[n];
        v = new boolean[n];
        s = new int[n / 2];
        l = new int[n / 2];

        for (int i = 0; i < n; i++) {
            all[i] = i;
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        subTeam(0, 0);

        System.out.println(min);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BAEKJOON15686 {
    static int n, m;
    static int[][] a;
    static List<int[]> hl, cl;
    static List<int[]>[] scl;
    static boolean[] v;
    static int ans = Integer.MAX_VALUE;

    static void select(int cnt, int start) {
        if (cnt == m) {
            int chickenRoad = 0;
            for (int[] house : hl) {
                int min = Integer.MAX_VALUE;
                for (List<int[]> chicken : scl) {
                    int leng = Math.abs(chicken.get(0)[0] - house[0]) + Math.abs(chicken.get(0)[1] - house[1]);
                    min = Math.min(min, leng);
                }
                chickenRoad += min;
            }
            ans = Math.min(ans, chickenRoad);

            return;
        }
        for (int i = start; i < v.length; i++) {
            if (v[i]) continue;
            v[i] = true;
            scl[cnt] = new ArrayList<>();
            scl[cnt].add(cl.get(i));
            select(cnt + 1, i + 1);
            v[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        hl = new ArrayList<>();
        cl = new ArrayList<>();
        scl = new ArrayList[m];

        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if (a[i][j] == 1) {
                    hl.add(new int[]{i, j});
                } else if (a[i][j] == 2) {
                    cl.add(new int[]{i, j});
                }
            }
        }

        v = new boolean[cl.size()];

        select(0, 0);

        System.out.println(ans);
    }
}

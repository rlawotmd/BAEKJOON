import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON6603 {
    static int n;
    static int[] a;
    static boolean[] v;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void num(int cnt, int p) throws IOException {
        if (cnt == 6) {
            for (int i = 0; i < n; i++) {
                if (v[i]) bw.write(a[i] + " ");
            }
            bw.write("\n");
        }
        for (int i = p; i < n; i++) {
            v[i] = true;
            num(cnt + 1, i + 1);
            v[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            a = new int[n];
            v = new boolean[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            num(0, 0);
            bw.write("\n");
        }
        bw.flush();
    }
}

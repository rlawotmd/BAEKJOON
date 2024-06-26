import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BAEKJOON9934 {
    static int[] a;
    static int[][] b;
    static int n, cnt;
    static List<Integer>[] l;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void div(int front, int end, int level) {
        if (n == level) return;

        int mid = (front + end) / 2;
        l[level].add(a[mid]);

        div(front, mid - 1, level + 1);
        div(mid + 1, end, level + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        cnt = 0;

        a = new int[(int) Math.pow(2, n) - 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        l = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            l[i] = new ArrayList<>();
        }

        div(0, a.length - 1, 0);
        for (List<Integer> l : l) {
            for (int i = 0; i < l.size(); i++) {
                bw.write(l.get(i) + " ");
            }
            bw.newLine();
        }

        bw.flush();

    }
}

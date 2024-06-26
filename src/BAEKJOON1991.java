import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1991 {
    static int[][] a;
    static boolean[] v;
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void preOrder(int root) throws Exception {
        bw.write(root + 'A');
        for (int i = 1; i < n; i++) {
            if (a[root][i] == -1) {
                preOrder(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[root][i] == 1) {
                preOrder(i);
            }
        }
    }

    static void inOrder(int root) throws Exception {
        for (int i = 1; i < n; i++) {
            if (a[root][i] == -1) {
                inOrder(i);
            }
        }
        bw.write(root + 'A');
        for (int i = 1; i < n; i++) {
            if (a[root][i] == 1) {
                inOrder(i);
            }
        }
    }

    static void postOrder(int root) throws Exception {
        for (int i = 1; i < n; i++) {
            if (a[root][i] == -1) {
                postOrder(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[root][i] == 1) {
                postOrder(i);
            }
        }
        bw.write(root + 'A');
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char from = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            if (left - 'A' >= 0) a[from - 'A'][left - 'A'] = -1;
            if (right - 'A' >= 0) a[from - 'A'][right - 'A'] = 1;
        }

        preOrder(0);
        bw.write("\n");

        inOrder(0);
        bw.write("\n");

        postOrder(0);

        bw.flush();
    }
}

import java.io.*;

public class BAEKJOON1992 {
    static int[][] a;
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void div(int x, int y, int n) throws IOException {

        int num = a[x][y];
        boolean c = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num != a[i + x][j + y]) {
                    c = false;
                    break;
                }
            }
            if (!c) break;
        }

        if (c) {
//            bw.write("(");
            bw.write(num + "");
//            bw.write(")");
        }
        else {
            bw.write("(");
            // 2사
            div(x, y, n / 2);
            // 1사
            div(x, y + n / 2, n / 2);
            // 3사
            div(x + n / 2, y, n / 2);
            // 4사
            div(x + n / 2, y + n / 2, n / 2);
            bw.write(")");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }

        div(0, 0, n);

        bw.flush();



    }
}

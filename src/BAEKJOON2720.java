import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int q = m / 25;
            m %= 25;
            int d = m / 10;
            m %= 10;
            int b = m / 5;
            m %= 5;
            int p = m;
            bw.write(q + " " + d + " " + b + " " + p + "\n");
        }
        bw.flush();
    }
}

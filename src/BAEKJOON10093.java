import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        if(n == m) {
            System.out.println(0);
        } else if(n < m) {
            long cnt = m - n - 1;
            bw.write(cnt + "\n");
            for (long i = n + 1; i < m; i++)
                bw.write(i + " ");
        } else {
            long cnt = n - m - 1;
            bw.write(cnt + "\n");
            for (long i = m + 1; i < n; i++)
                bw.write(i + " ");
        }
        bw.flush();
    }
}

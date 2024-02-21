import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int a, b, c;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), ",");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = a + b;
            bw.write(c + "\n");
        }
        bw.flush();
    }
}

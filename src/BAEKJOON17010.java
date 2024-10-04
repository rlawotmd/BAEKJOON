import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON17010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 0; j < a; j++) {
                bw.write(s);
            }
            bw.newLine();
        }
        bw.flush();
    }
}

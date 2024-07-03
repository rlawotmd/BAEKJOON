import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON26546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = 0; j < s.length(); j++) {
                if (j >= start && j < end) continue;
                bw.write(s.charAt(j) + "");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}

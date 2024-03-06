import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int head = 0; head < s.length(); head++) {
                for(int j = 0; j < m; j++) {
                    bw.write(s.charAt(head));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}

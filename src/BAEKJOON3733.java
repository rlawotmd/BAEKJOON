import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON3733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String cur = br.readLine();
            if (cur == null) break;
            StringTokenizer st = new StringTokenizer(cur);
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            sb.append(s / (n+1)).append('\n');
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON29722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        d += n;
        m = m + ((d - 1) / 30);
        d = (d - 1) % 30 + 1;
        y = y + ((m - 1) / 12);
        m = (m - 1) % 12 + 1;

        StringBuilder sb = new StringBuilder();
        sb.append(y + "-");
        if (m < 10) sb.append("0");
        sb.append(m + "-");
        if (d < 10) sb.append("0");
        sb.append(d);

        System.out.println(sb);

    }
}

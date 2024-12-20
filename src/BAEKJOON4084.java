import java.io.*;
import java.util.*;

public class BAEKJOON4084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int cnt = 0;
            if (a == 0 && a == b && a == c && a == d) break;
            while (a != b || a != c || a != d) {
                ++cnt;
                int temp = a;
                a = Math.abs(a - b);
                b = Math.abs(b - c);
                c = Math.abs(c - d);
                d = Math.abs(d - temp);
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
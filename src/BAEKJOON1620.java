import java.io.*;
import java.util.*;

public class BAEKJOON1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            hm1.put(i, s);
            hm2.put(s, i);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            try {
                int num = Integer.parseInt(s);
                bw.write(hm1.get(num) + "\n");
            } catch (Exception e) {
                bw.write(hm2.get(s) + "\n");
            }
        }
        bw.flush();
    }
}

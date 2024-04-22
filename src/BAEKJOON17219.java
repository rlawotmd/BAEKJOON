import java.io.*;
import java.util.*;

public class BAEKJOON17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            hm.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            bw.write(hm.get(br.readLine()) + "\n");
        }

        bw.flush();
    }
}

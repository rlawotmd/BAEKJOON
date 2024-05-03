import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BAEKJOON9375 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> hm = new HashMap<>();
            int num = Integer.parseInt(br.readLine());
            String name = "";
            String Key = "";
            for (int j = 0; j < num; j++) {
                st = new StringTokenizer(br.readLine());
                name = st.nextToken();
                Key = st.nextToken();
                if (hm.containsKey(Key)) {
                    int l = hm.get(Key) + 1;
                    hm.replace(Key, l);
                } else {
                    hm.put(Key, 2);
                }
            }
            if (hm.size() == 1) {
                bw.write((hm.get(Key) - 1) + "\n");
            } else {
                int ans = 1;
                for (int q : hm.values()) {
                    ans *= q;
                }
                bw.write((ans - 1) + "\n");
            }
        }
        bw.flush();
    }
}

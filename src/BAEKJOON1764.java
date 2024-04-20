import java.io.*;
import java.util.*;

public class BAEKJOON1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }

        ArrayList<String> ans = new ArrayList<>();

        int point = 0;
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (hs.contains(s)) {
                ans.add(s);
                point++;
            }
        }

        Collections.sort(ans);
        bw.write(point + "\n");
        for (String s : ans) bw.write(s + "\n");
        bw.flush();
    }
}

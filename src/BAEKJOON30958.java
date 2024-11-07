import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON30958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine().trim();
        int max = -1;
        for (int i = 0; i < 26; i++) {
            int c = 'a' + i;
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) cnt++;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}

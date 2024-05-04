import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long m = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();

        long count = 0;
        long ans = 0;

        for (int i = 1; i < m - 1; i++) {
            if (c[i - 1] == 'I' && c[i] == 'O' && c[i + 1] == 'I') {
                count++;
                if (count == n) {
                    ans++;
                    count--;
                }
                i++;
            } else {
                count = 0;
            }
        }

        System.out.println(ans);
    }
}
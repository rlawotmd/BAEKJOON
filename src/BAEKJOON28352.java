import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON28352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        System.out.println(ans / 604800);
    }
}

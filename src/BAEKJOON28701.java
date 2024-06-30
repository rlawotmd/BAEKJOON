import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            ans1 += i;
            ans3 += (int) Math.pow(i, 3);
        }

        System.out.println(ans1);
        System.out.println((int) Math.pow(ans1, 2));
        System.out.println(ans3);
    }
}

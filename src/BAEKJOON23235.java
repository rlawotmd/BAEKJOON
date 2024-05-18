import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            String s = br.readLine();
            if (s.charAt(0) == '0') break;
            n++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Case " + i + ": Sorting... done!");
        }
    }
}

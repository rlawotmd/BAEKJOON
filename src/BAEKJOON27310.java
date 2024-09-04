import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON27310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = s.length();
        int b = 2;
        int c = 0;
        for (int i = 1; i < a; i++) {
            if (s.charAt(i) == '_') c++;
        }
        System.out.println(a + b + (c * 5));
    }
}

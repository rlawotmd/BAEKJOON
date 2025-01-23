import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON23080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (i % n == 0) {
                System.out.print(str[i]);
            }
        }
    }
}

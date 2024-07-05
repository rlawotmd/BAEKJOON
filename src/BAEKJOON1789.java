import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int s = 0;
        int num = 1;
        while (n > 0) {
            s++;
            n -= num;
            num++;
            if (n < 0) s--;
        }

        System.out.println(s);
    }
}

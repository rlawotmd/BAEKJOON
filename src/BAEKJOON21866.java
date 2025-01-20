import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON21866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > arr[i]) {
                System.out.println("hacker");
                return;
            } else {
                sum += n;
            }
        }
        if (sum >= 100) {
            System.out.println("draw");
        } else {
            System.out.println("none");
        }
    }
}

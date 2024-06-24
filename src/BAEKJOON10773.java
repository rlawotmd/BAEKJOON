import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BAEKJOON10773 {
    static ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sum -= stack.peek();
                stack.pop();
            } else {
                stack.push(num);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}

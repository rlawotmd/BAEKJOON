import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON25024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            System.out.println("i: " + i);
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            if (num1 < 24 && num2 < 60) {
                sb.append("Yes ");
            }
            if (num1 >= 24 && num2 >= 60) {
                sb.append("No ");
            }

            if (num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12) {
                if (num2 > 0 && num2 <= 31) {
                    sb.append("Yes\n");
                } else {
                    sb.append("No\n");
                }
            } else if (num1 == 2) {
                if (num2 > 0 && num2 <= 29) {
                    sb.append("Yes\n");
                } else {
                    sb.append("No\n");
                }
            } else if (num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11) {
                if (num2 > 0 && num2 <= 30) {
                    sb.append("Yes\n");
                } else {
                    sb.append("No\n");
                }
            }
        }
        System.out.println(sb);
    }
}
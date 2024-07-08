import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON29766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = "DKSH";
        int num = 0;

        for (int i = 0; i < s.length() - 3; i++) {
            boolean check = true;
            for (int j = 0; j < 4; j++) {
                if (s.charAt(i + j) != ans.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                num++;
                i += 3;
            }
        }
        System.out.println(num);
    }
}

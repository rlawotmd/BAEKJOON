import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String check_s = "";
            Boolean check = true;
            for (int j = 0; j < s.length(); j++) {
                if (!check_s.contains(String.valueOf(s.charAt(j)))) {
                    check_s = check_s.concat(String.valueOf(s.charAt(j)));
                } else {
                    if (s.charAt(j) == s.charAt(j - 1)) {
                        check = true;
                    } else {
                        check = false;
                    }
                if (!check) break;
                }
            }
            if (check) ans++;
        }

        System.out.println(ans);
    }
}

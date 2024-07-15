import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < a[0].length(); i++) {
            char c = a[0].charAt(i);
            boolean check = true;
            for (int j = 1; j < a.length; j++) {
                if (c != a[j].charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (check) sb.append(c);
            else sb.append("?");
        }

        System.out.println(sb);
    }
}

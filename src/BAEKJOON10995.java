import java.io.*;

public class BAEKJOON10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= 2*n; j++) {
                    if (j % 2 == 1) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            } else {
                for (int j = 1; j <= 2*n; j++) {
                    if (j % 2 == 1) {
                        sb.append(" ");
                    } else {
                        sb.append("*");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 public class BAEKJOON23810 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         StringBuilder sb = new StringBuilder();
         print(n, sb, 0);
         print(n, sb, 1);
         print(n, sb, 0);
         print(n, sb, 1);
         print(n, sb, 1);
         System.out.println(sb);
     }

    private static void print(int n, StringBuilder sb, int type) {
        for (int i = 0; i < n; i++) {
            switch (type) {
                case 0:
                    for (int j = 0; j < 5 * n; j++) {
                        sb.append('@');
                    }
                    sb.append('\n');
                    break;
                case 1:
                    for (int j = 0; j < n; j++) {
                        sb.append('@');
                    }
                    sb.append('\n');
                    break;
            }
        }
    }
}

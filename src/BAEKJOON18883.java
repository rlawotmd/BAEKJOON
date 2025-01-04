import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BAEKJOON18883 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(num++ + "");
                if (j < m - 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}

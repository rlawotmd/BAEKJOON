import java.io.*;
import java.math.BigInteger;

public class BAEKJOON1914 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static BigInteger cnt;
    public static void movehanoi(int n, int from, int tmp, int to) throws IOException {
        if (n == 1) {
            bw.write(from + " " + to + "\n");
            return;
        }
        movehanoi(n - 1, from, to, tmp);
        movehanoi(1, from, tmp, to);
        movehanoi(n - 1, tmp, from, to);
    }
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        cnt = BigInteger.TWO.pow(n).subtract(BigInteger.ONE);
        System.out.println(cnt);
        if (n <= 20) {
            movehanoi(n, 1, 2, 3);
            bw.flush();
        }
    }
}

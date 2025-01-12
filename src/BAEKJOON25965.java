import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BAEKJOON25965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] k = new int[m];
            int[] d = new int[m];
            int[] a = new int[m];
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                k[j] = Integer.parseInt(st.nextToken());
                d[j] = Integer.parseInt(st.nextToken());
                a[j] = Integer.parseInt(st.nextToken());
            }
            BigInteger ans = BigInteger.ZERO;
            st = new StringTokenizer(br.readLine(), " ");
            long kd = Integer.parseInt(st.nextToken());
            long dd = Integer.parseInt(st.nextToken());
            long ad = Integer.parseInt(st.nextToken());
            for (int j = 0; j < m; j++) {
                BigInteger sum = BigInteger.ZERO;
                sum = sum.add(BigInteger.valueOf((k[j] * kd) + (a[j] * ad)));
                sum = sum.subtract(BigInteger.valueOf(d[j] * dd));
                if (sum.compareTo(BigInteger.ZERO) >= 0) {
                    ans = ans.add(sum);
                }
            }
            bw.write(ans.toString() + "\n");
        }
        bw.flush();
    }
}

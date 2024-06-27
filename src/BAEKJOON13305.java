import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON13305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());

        long[] l = new long[(int) (n - 1)];
        long[] p = new long[(int) n];


        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < l.length; i++) {
            l[i] = Long.parseLong(st.nextToken());
        }

        long min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < p.length; i++) {
            long price = Long.parseLong(st.nextToken());
            min = Math.min(min, price);
            p[i] = min;
        }

        long sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += p[i] * l[i];
        }
        System.out.println(sum);
    }
}

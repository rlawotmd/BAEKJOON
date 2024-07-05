import java.io.*;
import java.util.*;
import java.util.stream.Collector;

public class BAEKJOON2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        max = -1;
        int point = 1;

        for (int i = 1; i <= n; i++) {
            if (a[n - i] * i > max) {
                max = a[n - i] * i;
            }
        }

        System.out.println(max);

    }
}

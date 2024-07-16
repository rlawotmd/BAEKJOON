import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] a = new int[5];
        int max;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        max = a[2];


        int cnt = 0;
        while (cnt < 3) {
            cnt = 0;

            for (int i = 0; i < 5; i++) {
                if (max % a[i] == 0) cnt++;
            }

            if (cnt >= 3) break;
            else max++;
        }

        System.out.println(max);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) max = arr[i];
        }

        max++;
        int min = 0;
        int mid;
        long sum;

        while (max > min) {
            sum = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < n; i++) {
                int leng = arr[i] - mid;
                if (leng > 0) sum += leng;
            }
            if (sum < m) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);

    }
}

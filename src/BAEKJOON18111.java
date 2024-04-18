import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int high = 0;
        int low = 256;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (low > arr[i][j]) low = arr[i][j];
                if (high < arr[i][j]) high = arr[i][j];
            }
        }

        int max = -1;
        int time = 99999999;

        for (int h = low; h <= high; h++) {
            int have_block = b;
            int break_block = 0;
            int set_block = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (h > arr[i][j]) {
                        set_block += h - arr[i][j];
                        have_block -= h - arr[i][j];
                    }
                    if (h < arr[i][j]) {
                        break_block += arr[i][j] - h;
                        have_block += arr[i][j] - h;
                    }
                }
            }

            if (have_block < 0) continue;
            int spend_time = set_block + (break_block * 2);
            if (spend_time < time) {
                time = spend_time;
                max = h;
            }
            else if (spend_time == time && max < h) max = h;
        }

        System.out.println(time + " " + max);
    }
}
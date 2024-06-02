import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON9663 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] used;
    static int[] num_arr;
    static int[] arr;
    static int n, m;

    public static void fuc(int loc) throws IOException {
        if (m == loc) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) continue;
            used[i] = true;

            arr[loc] = num_arr[i];
            fuc(loc + 1);

            used[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        num_arr = new int[n];
        used = new boolean[n];
        arr = new int[m];

        for (int i = 0; i < n; i++) {
            num_arr[i] = i + 1;
        }

        fuc(0);
        bw.flush();
    }
}

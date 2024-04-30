import java.io.*;

public class BAEKJOON9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] arr = new long[101];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= 100; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int point = Integer.parseInt(br.readLine());
            bw.write(arr[point] + "\n");
        }

        bw.flush();
    }
}

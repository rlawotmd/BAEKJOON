import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1759 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int l, c, start;
    static String[] arr, pass;
    static boolean[] v;

    static void fuc(int start, int cnt) throws IOException {
        if (cnt == l) {
            int mCount = 0;
            String s = String.join("", pass);
            if (s.contains("a")) mCount++;
            if (s.contains("e")) mCount++;
            if (s.contains("i")) mCount++;
            if (s.contains("o")) mCount++;
            if (s.contains("u")) mCount++;
            if (l - mCount >= 2 && mCount > 0) bw.write(s + "\n");
            return;
        }
        for (int i = start; i < c; i++) {
            if (v[i]) continue;
            v[i] = true;
            pass[cnt] = arr[i];
            fuc(i + 1, cnt + 1);
            v[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = br.readLine().split(" ");
        Arrays.sort(arr);

        pass = new String[l];
        v = new boolean[c];
        start = 0;

        fuc(0, 0);

        bw.flush();

    }
}

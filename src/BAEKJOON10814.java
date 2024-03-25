import java.io.*;
import java.util.*;

public class BAEKJOON10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[201];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            if (arr[m] == null) {
                arr[m] = st.nextToken();
            } else {
                arr[m] = arr[m] + " " + st.nextToken();
            }
        }

        for(int i = 1; i <= 200; i++) {
            if(arr[i] == null) continue;
            st = new StringTokenizer(arr[i], " ");
            while (st.hasMoreTokens()) {
                bw.write(i + " " + st.nextToken() + "\n");
            }
        }

        bw.flush();
    }
}

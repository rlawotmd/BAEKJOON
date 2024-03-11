import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[] arr_a = new String[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr_a[i] = st.nextToken();
        }

        int m = Integer.parseInt(br.readLine());
        String[] arr_b = new String[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            arr_b[i] = st.nextToken();
        }
        for(int i = 0; i < m; i++) {
            //String s = st.nextToken();
            if (arr_a.equals(arr_b[i])) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}

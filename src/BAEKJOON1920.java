import java.io.*;
import java.util.*;

public class BAEKJOON1920 {
    public static boolean binary(int n, int[] arr, int key) {
        int low = 0;
        int high = n - 1;
        int mid;
        for(int i = 0; i < 21; i++) {
            mid = (low + high) / 2;
            if (key == arr[mid]) return true;
            else if (key < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            if(binary (n, arr, key)) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.flush();
    }
}

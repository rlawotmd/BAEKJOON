import java.io.*;
import java.util.Arrays;

public class BAEKJOON1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arr);
        for (int i = s.length() - 1; i >= 0; i--) {
            bw.write(arr[i] + "");
        }
        bw.flush();
    }
}

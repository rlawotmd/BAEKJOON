import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BAEKJOON18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] stay = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            stay[i] = arr[i];
        }

        Arrays.sort(arr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        int point = 0;
        int loc = 0;
        while (point < n) {
            if (hm.containsKey(arr[point])) {
                point++;
                continue;
            }
            hm.put(arr[point], loc);
            point++;
            loc++;
        }
        for (int i = 0; i < n; i++) {
            bw.write(hm.get(stay[i]) + " ");
        }
        bw.flush();
    }
}

import java.io.*;
import java.util.*;

public class BAEKJOON2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> loc = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            count.put(num, count.getOrDefault(num, 0) + 1);
            loc.put(num, loc.getOrDefault(num, i));
            hs.add(num);
        }

        Integer[] keys = hs.toArray(new Integer[hs.size()]);

        Integer[][] arr = new Integer[keys.length][3];
        for (int i = 0; i < keys.length; i++) {
            arr[i][0] = keys[i];
            arr[i][1] = count.get(keys[i]);
            arr[i][2] = loc.get(keys[i]);
        }

        Arrays.sort(arr, ((o1, o2) -> o1[1] == o2[1] ? o1[2] - o2[2] : o2[1] - o1[1]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i][1]; j++) bw.write(arr[i][0] + " ");
        }

        bw.flush();

    }
}

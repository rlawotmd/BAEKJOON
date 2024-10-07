import java.io.*;
import java.util.*;

public class BAEKJOON7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st;
            int num = Integer.parseInt(br.readLine());
            TreeMap<Long, Integer> map = new TreeMap<>();
            for (int j = 0; j < num; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                String s = st.nextToken();
                int input = Integer.parseInt(st.nextToken());
                if (s.equals("I")) {
                    map.computeIfAbsent((long) input, key -> 0);
                    map.put((long) input, map.get((long) input) + 1);
                    continue;
                }
                if (map.isEmpty()) continue;
                if (s.equals("D")) {
                    if (input == -1) {
                        map.put(map.firstKey(), map.get(map.firstKey()) - 1);
                        if (map.get(map.firstKey()) == 0) map.remove(map.firstKey());
                        continue;
                    }
                    map.put(map.lastKey(), map.get(map.lastKey()) - 1);
                    if (map.get(map.lastKey()) == 0) map.remove(map.lastKey());
                }
            }
            if (map.isEmpty()) bw.write("EMPTY\n");
            else {
                if (map.size() == 1) {
                    long output = map.firstKey();
                    bw.write(output + " " + output + "\n");
                    continue;
                }
                bw.write(map.lastKey() + " " + map.firstKey() + "\n");
            }
        }
        bw.flush();
    }
}
import java.io.*;
import java.util.*;

public class BAEKJOON11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        HashSet<Long> set = new HashSet<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
            set.add(num);
            if (max < map.get(num)) max = map.get(num);
        }

        Long[] arr = set.toArray(new Long[set.size()]);
        Arrays.sort(arr);

        for (Long num : arr) {
            if (max == map.get(num)) {
                System.out.println(num);
                break;
            }
        }
    }
}

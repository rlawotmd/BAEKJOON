import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] v = new boolean[100001];
        Queue<Integer> q = new LinkedList<>();
        int time = -1;
        q.add(n);
        v[n] = true;

        while (!q.isEmpty()) {
            time++;
            int cur = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                cur = q.remove();
                if (cur == m) break;
                int one = cur - 1;
                if (one >= 0 && one <= 100000 && !v[one]) {
                    v[one] = true;
                    q.add(one);
                }
                int two = cur + 1;
                if (two >= 0 && two <= 100000 && !v[two]) {
                    v[two] = true;
                    q.add(two);
                }
                int three = cur * 2;
                if (three >= 0 && three <= 100000 && !v[three]) {
                    v[three] = true;
                    q.add(three);
                }
            }
            if (cur == m) break;
        }

        System.out.println(time);
    }
}

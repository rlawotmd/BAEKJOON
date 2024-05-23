import java.io.*;
import java.util.PriorityQueue;

public class BAEKJOON1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (q.isEmpty()) bw.write(0 + "\n");
                else bw.write(q.remove() + "\n");
            } else {
                q.add(num);
            }
        }

        bw.flush();
    }
}

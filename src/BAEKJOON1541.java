import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BAEKJOON1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() && sb.length() != 0) {
                q.add(Integer.parseInt(sb.toString()));
                continue;
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (sb.length() != 0) q.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            } else sb.append(s.charAt(i));
        }

        int min = 0;

        while (!q.isEmpty()) {
            int num = q.poll();
            if (num < 0 && !q.isEmpty()) {
                int absNum = Math.abs(num);
                while (!q.isEmpty() && q.peek() > 0) {
                    absNum += q.poll();
                }
                min += (absNum * -1);
            }
            else min += num;
        }

        System.out.println(min);
    }
}

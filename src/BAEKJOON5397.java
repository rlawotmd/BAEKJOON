import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BAEKJOON5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Character> left;
        Deque<Character> right;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            left = new ArrayDeque<>();
            right = new ArrayDeque<>();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                switch (c) {
                    case '<':
                        if (left.isEmpty()) continue;
                        right.push(left.pop());
                        break;
                    case '>':
                        if (right.isEmpty()) continue;
                        left.push(right.pop());
                        break;
                    case '-':
                        if (left.isEmpty()) continue;
                        left.pop();
                        break;
                    default :
                        left.push(c);
                        break;
                }
            }
            while (!left.isEmpty()) bw.write(left.pollLast());
            while (!right.isEmpty()) bw.write(right.pop());
            bw.write("\n");
        }

        bw.flush();
    }
}

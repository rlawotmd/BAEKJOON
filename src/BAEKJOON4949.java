import java.io.*;
import java.util.Stack;

public class BAEKJOON4949 {
    static Stack<Character> stack;
    static boolean check(String s) {
        stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[' || c == '(') stack.push(c);

            if ((c == ']' || c == ')') && stack.isEmpty()) return false;

            if (c == ']') {
                if (stack.peek() == '[') stack.pop();
                else return false;
            }
            if (c == ')') {
                if (stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while (true) {
            s = br.readLine();
            if (s.length() == 1 && s.charAt(0) == '.') break;

            if (check(s)) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
    }
}

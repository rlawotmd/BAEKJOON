import java.io.*;
import java.util.Stack;

public class BAEKJOON9012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Stack stack;
    public static String def(String s) throws IOException {
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == '(') {
                stack.push(c);
            }
            else if(stack.empty()) {
                return "NO\n";
            }
            else {
                stack.pop();
            }

                /*if (s.charAt(j) == '(') stack.push("(");
                if (s.charAt(j) == ')') {
                    if (stack.empty()) {
                        bw.write("NO\n");
                        break;
                    } else stack.pop();
                }*/
        }
        if(stack.empty()) return "YES\n";
        else return "NO\n";
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            stack = new Stack<>();
            String s = br.readLine();
            bw.write(def(s));
        }
        bw.flush();
    }
}

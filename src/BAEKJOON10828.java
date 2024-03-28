import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BAEKJOON10828 {
    public static class stack {
        Stack stack = new Stack();

        public void push(int a) {
            stack.push(a);
        }

        public int pop() {
            if (stack.empty()) return -1;
            else return (int) stack.pop();
        }

        public int empty() {
            if (stack.empty()) return 1;
            else return 0;
        }

        public int size() {
            return stack.size();
        }

        public int top() {
            if (stack.empty()) return -1;
            else return (int) stack.peek();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        stack stack = new stack();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            int b = 0;
            if (st.hasMoreTokens()) {
                b = Integer.parseInt(st.nextToken());
            }
            if (a.contentEquals("push")) stack.push(b);
            if (a.contentEquals("pop")) bw.write(stack.pop() + "\n");
            if (a.contentEquals("size")) bw.write(stack.size() + "\n");
            if (a.contentEquals("empty")) bw.write(stack.empty() + "\n");
            if (a.contentEquals("top")) bw.write(stack.top() + "\n");
        }

        bw.flush();
    }
}

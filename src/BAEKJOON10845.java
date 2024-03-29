import java.io.*;
import java.util.*;

public class BAEKJOON10845 {
    public static class queue {
        Queue q = new LinkedList();
        static int num;

        void push(int n) {
            q.add(n);
            num = n;
        }

        int pop() {
            if(q.isEmpty()) return -1;
            else {
                int num = (int) q.element();
                q.remove();
                return num;
            }

        }

        int size() {
            return q.size();
        }

        int empty() {
            if (q.isEmpty()) return 1;
            else return 0;
        }

        int front() {
            if (q.isEmpty()) return -1;
            else return (int) q.peek();
        }

        int back() {
            if (q.isEmpty()) return -1;
            else return num;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        queue q = new queue();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            int b = 0;
            if (st.hasMoreTokens()) {
                b = Integer.parseInt(st.nextToken());
            }
            if (a.contentEquals("push")) q.push(b);
            if (a.contentEquals("pop")) bw.write(q.pop() + "\n");
            if (a.contentEquals("size")) bw.write(q.size() + "\n");
            if (a.contentEquals("empty")) bw.write(q.empty() + "\n");
            if (a.contentEquals("front")) bw.write(q.front() + "\n");
            if (a.contentEquals("back")) bw.write(q.back() + "\n");
        }

        bw.flush();
    }
}

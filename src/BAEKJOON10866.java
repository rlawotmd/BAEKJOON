import java.io.*;
import java.util.*;

public class BAEKJOON10866 {
    static Deque<Integer> dq = new ArrayDeque<>();
    static void push_front(int n) {
        dq.addFirst(n);
    }

    static void push_back(int n) {
        dq.addLast(n);
    }

    static int pop_front() {
        if (dq.isEmpty()) return -1;
        else {
            int n = dq.getFirst();
            dq.removeFirst();
            return n;
        }
    }

    static int pop_back() {
        if (dq.isEmpty()) return -1;
        else {
            int n = dq.getLast();
            dq.removeLast();
            return n;
        }
    }

    static int size() {
        return dq.size();
    }

    static int empty() {
        if (dq.isEmpty()) return 1;
        else return 0;
    }

    static int front() {
        if (dq.isEmpty()) return -1;
        else return dq.peekFirst();
    }

    static int back() {
        if (dq.isEmpty()) return -1;
        else return dq.peekLast();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if (s.equalsIgnoreCase("push_front")) push_front(Integer.parseInt(st.nextToken()));
            if (s.equalsIgnoreCase("push_back")) push_back(Integer.parseInt(st.nextToken()));
            if (s.equalsIgnoreCase("pop_front")) sb.append(pop_front() + "\n");
            if (s.equalsIgnoreCase("pop_back")) sb.append(pop_back() + "\n");
            if (s.equalsIgnoreCase("size")) sb.append(size() + "\n");
            if (s.equalsIgnoreCase("empty")) sb.append(empty() + "\n");
            if (s.equalsIgnoreCase("front")) sb.append(front() + "\n");
            if (s.equalsIgnoreCase("back")) sb.append(back() + "\n");
        }
        System.out.println(sb);
    }
}

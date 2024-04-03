import java.io.*;
import java.util.*;

public class BAEKJOON1874 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    static Stack<Integer> stack = new Stack<>();

    static void push(int n) throws IOException {
        stack.push(n);
        sb.append("+\n");
    }

    static void pop() throws IOException {
        stack.pop();
        sb.append("-\n");
    }

    static int search(int n, int[] arr) throws IOException {
        int point = 0;
        int num = 1;
        while (true) {
            if (!stack.isEmpty()) {
                if (stack.peek() == arr[point]) {
                    pop();
                    point += 1;
                    continue;
                } else if (num > n) {
                    break;
                }
            }

            if (num <= n) {
                push(num);
                num += 1;
            }
            if (stack.isEmpty()) break;
        }
        if (stack.isEmpty()) return 1;
        else return 0;
    }


    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = search(n, arr);

        if (result == 1) System.out.println(sb.toString());
        else System.out.println("NO");
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BAEKJOON2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (true) {
            if(q.size() == 1) break;
            q.remove();
            if(q.size() == 1) break;
            q.add(q.poll());
        }

        System.out.println(q.peek());
    }
}

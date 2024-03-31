import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BAEKJOON2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

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

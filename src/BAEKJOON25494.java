import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BAEKJOON25494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq;
        for (int i = 0; i < n; i++) {
            pq = new PriorityQueue<>();
            pq.offer(sc.nextInt());
            pq.offer(sc.nextInt());
            pq.offer(sc.nextInt());
            System.out.println(pq.poll());
        }
    }
}

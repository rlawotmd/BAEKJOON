import java.util.*;

public class BAEKJOON11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("");
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        sb.append("<");

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int num = 0;

        while (!q.isEmpty()) {
            if (q.size() == 1) {
                sb.append(q.peek());
                q.remove();
                break;
            }
            num++;
            if (num == m) {
                num = 0;
                sb.append(q.peek() + ", ");
                q.remove();
            }
            else {
                q.add(q.remove());
            }
        }

        System.out.println(sb.toString() + ">");




    }
}

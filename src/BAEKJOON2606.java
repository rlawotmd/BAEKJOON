import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BAEKJOON2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int[][] arr = new int[c + 1][c + 1];
        boolean[] check = new boolean[c + 1];
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            arr[from][to] = 1;
            arr[to][from] = 1;
            check[to] = true;
            check[from] = true;
        }
        int count = 0;
        check[1] = false;
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= c; i++) {
            if (arr[1][i] == 1 && check[i]) {
                s.push(i);
                check[i] = false;
                count++;
            }
        }
        while (!s.isEmpty()) {
            int loc = s.pop();
            for (int i = 1; i <= c; i++) {
                if (arr[loc][i] == 1 && check[i]) {
                    s.push(i);
                    check[i] = false;
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

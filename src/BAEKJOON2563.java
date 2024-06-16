import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] paper = new int[100][100];
        int sum = 0;
        for (int start = 0; start < n; start++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x - 1; i < x + 9; i++) {
                for (int j = y - 1; j < y + 9; j++) {
                    if (i >= 100 || j >= 100) continue;
                    paper[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            sum += Arrays.stream(paper[i]).sum();
        }

        System.out.println(sum);

    }
}

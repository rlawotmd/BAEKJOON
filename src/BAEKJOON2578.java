import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON2578 {
    static int[][] a = new int[5][5];
    static boolean[][] v = new boolean[5][5];
    static int cnt = 0;
    static int line = 0;
    static final int[][] lc = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}};
    static final int[][] rc = {{0, 4}, {1, 3}, {2, 2}, {3, 1}, {4, 0}};

    static void check(int y, int x) {
        boolean check_line = true;
        for (int i = 0; i < 5; i++) { // 가로
            if (!v[y][i]) {
                check_line = false;
                break;
            }
        }
        if (check_line) line++;

        check_line = true;
        for (int i = 0; i < 5; i++) { // 세로
            if (!v[i][x]) {
                check_line = false;
                break;
            }
        }
        if (check_line) line++;

        if ((y == 0 && x == 0) || (y == 1 && x == 1) || (y == 2 && x == 2) || (y == 3 && x == 3) || (y == 4 && x == 4)) {
            check_line = true;
            for (int i = 0; i < 5; i++) { // 대각1
                int[] arr = lc[i];
                if (!v[arr[0]][arr[1]]) {
                    check_line = false;
                    break;
                }
            }
            if (check_line) line++;
        }

        if ((y == 0 && x == 4) || (y == 1 && x == 3) || (y == 2 && x == 2) || (y == 3 && x == 2) || (y == 4 && x == 0)) {
            check_line = true;
            for (int i = 0; i < 5; i++) { // 대각2
                int[] arr = rc[i];
                if (!v[arr[0]][arr[1]]) {
                    check_line = false;
                    break;
                }
            }
            if (check_line) line++;
        }
    }

    static void fun(int num) {
        cnt++;
        boolean find = false;
        int i, j = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (v[i][j]) continue;
                if (a[i][j] == num) {
                    v[i][j] = true;
                    find = true;
                    break;
                }
            }
            if (find) break;
        }
        check(i, j);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                fun(num);
                if (line >= 3) break;
            }
            if (line >= 3) break;
        }

        System.out.println(cnt);
    }
}

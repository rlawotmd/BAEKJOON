import java.io.*;
import java.util.*;

public class BAEKJOON14503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;

        while (true) {

            if (arr[r][c] == 0) { //청소 안돼있을시 청소
                arr[r][c] = 2;
                cnt++;
            }

            if (arr[r][c - 1] != 0 && arr[r + 1][c] != 0 && arr[r][c + 1] != 0 && arr[r - 1][c] != 0) { //동서남북 청소 안된 방 확인

                if (d == 0) { //북쪽 바라봄
                    if(arr[r + 1][c] == 1) {
                        break;
                    } else {
                        r += 1;
                        continue;
                    }
                } else if (d == 1) { //동쪽 바라봄
                    if(arr[r][c - 1] == 1) {
                        break;
                    } else {
                        c -= 1;
                        continue;
                    }
                } else if (d == 2) { //남쪽 바라봄
                    if(arr[r - 1][c] == 1) {
                        break;
                    } else {
                        r -= 1;
                        continue;
                    }
                } else if (d == 3) { //서쪽 바라봄
                    if(arr[r][c + 1] == 1) {
                        break;
                    } else {
                        c += 1;
                        continue;
                    }
                }
            }

            if (arr[r][c - 1] == 0 || arr[r + 1][c] == 0 || arr[r][c + 1] == 0 || arr[r - 1][c] == 0) { //동서남북 청소 안된 방 확인
                if (d == 0) {
                    d = 3;
                } else d -= 1;

                if (d == 0) { //북
                    if (arr[r - 1][c] == 0) {
                        r -= 1;
                        continue;
                    }
                } else if (d == 1) { //동
                    if (arr[r][c + 1] == 0) {
                         c += 1;
                        continue;
                    }
                } else if (d == 2) { //남
                    if (arr[r + 1][c] == 0) {
                        r += 1;
                        continue;
                    }
                } else if (d == 3) { //서
                    if (arr[r][c - 1] == 0) {
                        c -= 1;
                        continue;
                    }
                }

            }
        }

        System.out.println(cnt);
    }
}

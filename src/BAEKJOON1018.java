import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int min = n * m;

        for (int start_x = 0; start_x <= n - 8; start_x++) {
            for (int start_y = 0; start_y <= m - 8; start_y++) {
                int is_min = 0;
                char color = 'B';
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (arr[start_x + i][start_y + j] != color) is_min++;
                        if(color == 'W') color = 'B';
                        else if (color == 'B') color = 'W';
                    }
                    if(color == 'W') color = 'B';
                    else if (color == 'B') color = 'W';
                }
                if (is_min > 32) is_min = 64 - is_min;
                if (min > is_min) min = is_min;
            }
        }
        System.out.println(min);
    }
}

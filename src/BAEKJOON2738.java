import java.io.*;
import java.util.*;

public class BAEKJOON2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num_a = Integer.parseInt(st.nextToken());
        int num_b = Integer.parseInt(st.nextToken());

        int[][] arr_1 = new int[num_b][num_a];

        for(int i = 0; i < num_a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num_b; j++) {
                arr_1[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < num_a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num_b; j++) {
                System.out.print(arr_1[j][i] + Integer.parseInt(st.nextToken()) + " ");
            }
            System.out.println();
        }
    }
}

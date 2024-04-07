import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        int[] arr_a = new int[20000001];
        for (int i = 0; i < n; i++) {
            int loc = sc.nextInt() + 10000000;
            arr_a[loc] += 1;
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int find_loc = sc.nextInt() + 10000000;
            sb.append(arr_a[find_loc] + " ");
        }

        System.out.println(sb);
    }
}

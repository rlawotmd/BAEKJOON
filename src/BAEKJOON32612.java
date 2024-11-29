import java.util.Scanner;

public class BAEKJOON32612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double ans = 0;

        for (int i : arr) {
            ans += (i + 1) / 2.0;
        }

        System.out.printf("%.1f", ans);
    }
}

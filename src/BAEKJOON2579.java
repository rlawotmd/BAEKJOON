import java.util.Scanner;

public class BAEKJOON2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 1) dp[1] = arr[1];
        else if (n == 2) dp[2] = arr[1] + arr[2];
        else {
            dp[1] = arr[1];
            dp[2] = arr[2] + arr[1];
            dp[3] = Math.max(arr[1], arr[2]) + arr[3];
            for (int i = 4; i <= n; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
            }

        }
        System.out.println(dp[n]);
    }
}

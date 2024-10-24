import java.util.Scanner;

public class BAEKJOON31821 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[sc.nextInt()];
        }

        System.out.println(sum);
    }
}

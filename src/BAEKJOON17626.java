import java.util.Scanner;

public class BAEKJOON17626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50001];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = 50000;
            for (int j = 1; j * j <= i; j++) {
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            }
        }
        System.out.println(arr[n]);
    }
}

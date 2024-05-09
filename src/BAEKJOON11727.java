import java.util.Scanner;

public class BAEKJOON11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 3;

        if (n <= 2) System.out.println(arr[n]);
        else {
            for (int i = 3; i <= n; i++) {
                arr[i] = (arr[i - 2] * 2 + arr[i - 1]) % 10007;
            }
            System.out.println(arr[n]);
        }
    }
}

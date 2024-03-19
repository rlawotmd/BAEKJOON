import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        for(int i = n / 2; i < n; i++) {
            int m = i;
            if (m >= 100000) {
                arr[0] = m / 100000;
                m = m % 100000;
            }
            if (m >= 10000) {
                arr[1] = m / 10000;
                m = m % 10000;
            }
            if (m >= 1000) {
                arr[2] = m / 1000;
                m = m % 1000;
            }
            if (m >= 100) {
                arr[3] = m / 100;
                m = m % 100;
            }
            if (m >= 10) {
                arr[4] = m / 10;
                m = m % 10;
            }
            arr[5] = m;
            if ((i + Arrays.stream(arr).sum()) == n) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}

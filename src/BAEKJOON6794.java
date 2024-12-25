import java.util.Scanner;

public class BAEKJOON6794 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        boolean[] v = new boolean[6];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i + j == n) {
                    v[i] = true;
                }
            }
        }
        for (int i = 0; i <= n / 2; i++) {
            if (v[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


import java.util.Scanner;

public class BAEKJOON1074 {
    static int N, r, c, ans;

    static void div(int x, int y, int n) {
        if (n == 1) return;
        int sum = (n * n) / 4;

        if (x <= r && x + n / 2 > r && y <= c && y + n / 2 > c) {
            // 2사
            div(x, y, n / 2);
        }
        else if (x <= r && x + n / 2 > r && y + n / 2 <= c && y + n > c) {
            ans += sum;
            // 1사
            div(x, y + n / 2,  n / 2);
        }
        else if (x + n / 2 <= r && x + n > r && y <= c && y + n / 2 > c) {
            ans += sum * 2;
            // 3사
            div(x + n / 2, y, n / 2);
        }
        else if (x + n / 2 <= r && x + n > r && y + n / 2 <= c && y + n > c) {
            ans += sum * 3;
            // 4사
            div(x + n / 2, y + n / 2, n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        ans = 0;

        N = (int) Math.pow(2, N);
        div(0, 0, N);

        System.out.println(ans);
    }
}

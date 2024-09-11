import java.util.Scanner;

public class BAEKJOON29736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (i >= c - d && i <= c + d) ans++;
            if (i > c + d) break;
        }
        if (ans == 0) System.out.println("IMPOSSIBLE");
        else System.out.println(ans);
    }
}

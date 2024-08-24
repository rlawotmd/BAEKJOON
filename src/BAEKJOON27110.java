import java.util.Scanner;

public class BAEKJOON27110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = Math.min(n, a);
        ans += Math.min(n, b);
        ans += Math.min(n, c);
        System.out.println(ans);
    }
}

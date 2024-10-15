import java.util.Scanner;

public class BAEKJOON32498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 0) continue;
            if (m % 2 != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

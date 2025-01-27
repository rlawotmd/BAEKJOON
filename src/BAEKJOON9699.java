import java.util.Scanner;

public class BAEKJOON9699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int max = -1;
            for (int j = 0; j < 5; j++) {
                max = Math.max(max, sc.nextInt());
            }
            System.out.println("Case #" + i + ": " + max);
        }
    }
}

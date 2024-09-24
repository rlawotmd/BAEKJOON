import java.util.Scanner;

public class BAEKJOON28519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int ans = ((min * 2) + 1);
        if (x == y) ans--;

        System.out.println(ans);

    }
}

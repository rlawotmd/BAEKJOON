import java.util.Scanner;

public class BAEKJOON11970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (c >= b || d <= a) {
            System.out.println(b - a + d - c);
        } else {
            System.out.println(Math.max(b, d) - Math.min(a, c));
        }
    }
}

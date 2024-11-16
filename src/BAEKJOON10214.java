import java.util.Scanner;

public class BAEKJOON10214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = 0;
            int k = 0;
            for (int j = 0; j < 9; j++) {
                y += sc.nextInt();
                k += sc.nextInt();
            }
            if (y == k) {
                System.out.println("Draw");
            } else if (y > k) System.out.println("Yonsei");
            else System.out.println("Korea");
        }
    }
}

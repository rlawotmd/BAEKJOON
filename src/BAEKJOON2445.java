import java.util.Scanner;

public class BAEKJOON2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
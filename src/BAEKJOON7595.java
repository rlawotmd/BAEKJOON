import java.util.Scanner;

public class BAEKJOON7595 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) System.out.print("*");
                System.out.println();
            }
            n = sc.nextInt();
        }
    }
}

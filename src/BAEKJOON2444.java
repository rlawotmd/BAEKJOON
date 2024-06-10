import java.util.Scanner;

public class BAEKJOON2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder("*");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(sb.toString());
            sb.append("**");
        }
        sb.delete(0, 2);
        for (int i = n - 1; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            sb.delete(0, 2);
            System.out.println(sb.toString());
        }
    }
}

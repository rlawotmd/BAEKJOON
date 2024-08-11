import java.util.Scanner;

public class BAEKJOON28453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int l = sc.nextInt();
            if (l == 300) System.out.print(1 + " ");
            else if (l >= 275) System.out.print(2 + " ");
            else if (l >= 250) System.out.print(3 + " ");
            else System.out.print(4 + " ");
        }
    }
}

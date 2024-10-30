import java.util.Scanner;

public class BAEKJOON11966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int num = 2;

        for (int i = 0; i < 30; i++) {
            if (num == n) {
                System.out.println(1);
                return;
            }
            num *= 2;
        }
        System.out.println(0);
    }
}

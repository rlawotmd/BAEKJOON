import java.util.Scanner;

public class BAEKJOON11050 {
    public static int def(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return def(n - 1, k) + def(n - 1, k- 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(def(n, k));

    }
}

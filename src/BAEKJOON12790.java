import java.util.Scanner;

public class BAEKJOON12790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            int g = sc.nextInt();
            int h = sc.nextInt();
            int sum = a + e;
            sum += 5 * (b + f);
            sum += 2 * (c + g);
            sum += 2 * (d + h);
            System.out.println(sum);
        }
    }
}

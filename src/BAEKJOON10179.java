import java.util.Scanner;

public class BAEKJOON10179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = a * 0.8;
            System.out.printf("$%.2f\n", Math.round(b * 100.00) / 100.00);
        }
    }
}

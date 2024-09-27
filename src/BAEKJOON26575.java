import java.util.Scanner;

public class BAEKJOON26575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            double f = sc.nextDouble();
            double p = sc.nextDouble();

            System.out.println("$" + String.format("%.2f", d * f * p));
        }
    }
}

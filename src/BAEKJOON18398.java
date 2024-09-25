import java.util.Scanner;

public class BAEKJOON18398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println((num1 + num2) + " " + (num1 * num2));
            }
        }
    }
}

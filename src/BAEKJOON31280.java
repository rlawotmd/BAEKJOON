import java.util.Scanner;

public class BAEKJOON31280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        int sum = a + b + c + d - min + 1;
        System.out.println(sum);
    }
}

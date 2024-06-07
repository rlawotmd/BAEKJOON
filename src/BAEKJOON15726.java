import java.util.Scanner;

public class BAEKJOON15726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        System.out.println((int) Math.max((a * b / c), (a / b * c)));
    }
}
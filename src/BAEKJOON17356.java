import java.util.Scanner;

public class BAEKJOON17356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double m = (b - a) / 400;
        System.out.println((1 / (1 + Math.pow(10, m))));
    }
}

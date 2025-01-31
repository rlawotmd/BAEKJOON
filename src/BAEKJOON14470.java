import java.util.Scanner;

public class BAEKJOON14470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int result = 0;

        if (a < 0) {
            result += (Math.abs(a) * c);
            result += d;
            a = 0;
        }
        result += ((b - a) * e);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class BAEKJOON27332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a + 7 * b;

        if (d >= 1 && d <= 30) System.out.println(1);
        else System.out.println(0);
    }
}

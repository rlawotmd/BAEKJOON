import java.util.Scanner;

public class BAEKJOON24568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if ((n * 8 + m * 3) - 28 < 0) System.out.println(0);
        else System.out.println((n * 8 + m * 3) - 28);
    }
}

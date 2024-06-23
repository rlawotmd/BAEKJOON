import java.util.Scanner;

public class BAEKJOON14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        if (p * 2 > n + m) System.out.println(n + m);
        else System.out.println((n + m) - (p * 2));
    }
}

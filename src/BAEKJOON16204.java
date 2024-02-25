import java.util.Scanner;

public class BAEKJOON16204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int a = Math.min((n - m), (n  - k));
        int b = Math.min(m, k);
        System.out.println(a + b);
    }
}


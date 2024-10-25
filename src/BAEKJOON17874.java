import java.util.Scanner;

public class BAEKJOON17874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        System.out.println(4 * Math.max(h, n - h) * Math.max(v, n - v));
    }
}

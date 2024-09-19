import java.util.Scanner;

public class BAEKJOON24075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a + b;
        int m = a - b;
        System.out.println(Math.max(p, m) + "\n" + Math.min(p, m));
    }
}

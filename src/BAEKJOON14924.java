import java.util.Scanner;

public class BAEKJOON14924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        s *= 2;
        System.out.println(t * (d / s));
    }
}

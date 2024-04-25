import java.util.Scanner;

public class BAEKJOON26307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((h - 9) * 60 + m);
    }
}

import java.util.Scanner;

public class BAEKJOON32025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(a, b) * 100 / 2);
    }
}

import java.util.Scanner;

public class BAEKJOON25628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a / 2;
        System.out.println(Math.min(a, b));
    }
}

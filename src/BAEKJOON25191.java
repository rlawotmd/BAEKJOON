import java.util.Scanner;

public class BAEKJOON25191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(n, ((c / 2) + b)));
    }
}

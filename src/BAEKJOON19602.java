import java.util.Scanner;

public class BAEKJOON19602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + (b * 2) + (c * 3);
        if (d < 10) System.out.println("sad");
        else System.out.println("happy");
    }
}

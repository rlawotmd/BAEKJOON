import java.util.Scanner;

public class BAEKJOON1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int aWidth = (a - 1) / 4 + 1;
        int bWidth = (b - 1) / 4 + 1;
        int aLength = (a - 1) % 4 + 1;
        int bLength = (b - 1) % 4 + 1;

        int width = Math.abs(aWidth - bWidth);
        int length = Math.abs(aLength - bLength);

        System.out.println(width + length);
    }
}

import java.util.Scanner;

public class BAEKJOON24736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print((a[0] * 6 + a[1] * 3 + a[2] * 2 + a[3] + a[4] * 2) + " ");
        System.out.print((b[0] * 6 + b[1] * 3 + b[2] * 2 + b[3] + b[4] * 2) + " ");

    }
}

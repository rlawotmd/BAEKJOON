import java.util.Scanner;

public class BAEKJOON25286 {
    public static void main(String[] args) {
        int[] tmp = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            if (m == 1) {
                System.out.println(y - 1 + " " + 12 + " " + 31);
            } else {
                System.out.print(y + " " + (m - 1) + " ");
                if (m == 3 && ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(tmp[m - 1]);
                }
            }
        }
    }
}

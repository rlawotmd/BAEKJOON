import java.util.Scanner;

public class BAEKJOON28295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n == 1) a += 90;
            if (n == 2) a += 180;
            if (n == 3) a += 270;
            a = a % 360;
        }
        if (a == 0) System.out.println("N");
        if (a == 90) System.out.println("E");
        if (a == 180) System.out.println("S");
        if (a == 270) System.out.println("W");
    }
}

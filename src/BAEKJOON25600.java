import java.util.Scanner;

public class BAEKJOON25600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();
            int sco = a * (d + g);
            if (a == d + g) max = Math.max(max, sco * 2);
            else max = Math.max(max, sco);
        }
        System.out.println(max);
    }
}

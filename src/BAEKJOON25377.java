import java.util.Scanner;

public class BAEKJOON25377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1001;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) continue;
            min = Math.min(min, b);
        }

        if (min == 1001) min = -1;

        System.out.println(min);
    }
}

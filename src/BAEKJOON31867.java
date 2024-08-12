import java.util.Scanner;

public class BAEKJOON31867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int h = 0, g = 0;
        for (int i = 0; i < n; i++) {
            int num = s.charAt(i) - '0';
            if (num % 2 == 0) g++;
            else h++;
        }

        if (h == g) System.out.println(-1);
        else if (h > g) System.out.println(1);
        else System.out.println(0);
    }
}

import java.util.Scanner;

public class BAEKJOON27918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("D")) d++;
            else if (s.equals("P")) p++;

            if (Math.abs(d - p) >= 2) break;
        }
        System.out.println(d + ":" + p);
    }
}

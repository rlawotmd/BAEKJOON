import java.util.Scanner;

public class BAEKJOON13136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        long ans = 0;
        int rc = r / n;
        if (r % n != 0) rc++;
        int cc = c / n;
        if (c % n != 0) cc++;
        ans = (long) rc * cc;
        System.out.println(ans);
    }
}

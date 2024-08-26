import java.util.Scanner;

public class BAEKJOON15059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (i - a > 0) ans += (i - a);
        if (j - b > 0) ans += (j - b);
        if (k - c > 0) ans += (k - c);
        System.out.println(ans);
    }
}

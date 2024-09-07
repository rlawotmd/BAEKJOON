import java.util.Scanner;

public class BAEKJOON31615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int ans = 0;
        while (c > 0) {
            c = c / 10;
            ans++;
        }
        System.out.println(ans);
    }
}

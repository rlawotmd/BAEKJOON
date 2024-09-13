import java.util.Scanner;

public class BAEKJOON15700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0;

        n = n * m;
        ans = n / 2;

        System.out.println(ans);
    }
}

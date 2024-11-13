import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON14579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BigInteger ans = new BigInteger("1");
        for (int i = n; i <= m; i++) {
            int a = 0;
            for (int j = 1; j <= i; j++) {
                a += j;
            }
            ans = ans.multiply(BigInteger.valueOf(a));
        }

        System.out.println(ans.mod(BigInteger.valueOf(14579)));
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON15818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            result = result.multiply(BigInteger.valueOf(num));
        }

        System.out.println(result.mod(BigInteger.valueOf(m)));
    }
}

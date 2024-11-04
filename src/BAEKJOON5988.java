import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON5988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger num = sc.nextBigInteger();
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) System.out.println("even");
            else System.out.println("odd");
        }
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON8437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        System.out.println(n.subtract(m).divide(BigInteger.TWO).add(m));
        System.out.println(n.subtract(m).divide(BigInteger.TWO));
    }
}

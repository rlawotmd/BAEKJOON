import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON15963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        int ans = n.equals(m) ? 1 : 0;
        System.out.println(ans);
    }
}

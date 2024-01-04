import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON14928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        BigInteger n = sc.nextBigInteger();
//        BigInteger m = BigInteger.valueOf(20000303);
//        System.out.println(n.remainder(m));

        String s = sc.nextLine();
        long n = 0;
        for(int i = 0; i < s.length(); i++) {
            n = (n * 10 + (s.charAt(i) - '0')) % 20000303;
        }
        System.out.println(n);
    }
}

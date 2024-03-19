import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigInteger.valueOf(s.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }
}

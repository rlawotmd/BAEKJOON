import java.io.*;
import java.math.*;
import java.util.*;

public class BAEKJOON1271 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}

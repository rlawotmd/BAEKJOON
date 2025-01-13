import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BAEKJOON1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            BigInteger s = new BigInteger("0");
            int n = Integer.parseInt(br.readLine());

            for(int j = 0; j < n; j++) {
                BigInteger num = new BigInteger(br.readLine());
                s = s.add(num);
            }

            if (s.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            } else if (s.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            } else {
                System.out.println(0);
            }
        }
    }

}
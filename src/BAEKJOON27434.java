import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BAEKJOON27434 {
    static BigInteger fact(int a, int n) {
        BigInteger result = BigInteger.valueOf(a);
        if(a < n) {
            int b = (a + n) / 2;
            result = fact(a, b).multiply(fact(b + 1, n));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fact(1, n));
//        BigInteger[] arr = new BigInteger[3];
//        arr[0] = BigInteger.ONE;
//        for(int i = 1; i <= n; i++) {
//            arr[1] = BigInteger.valueOf(i);
//            arr[2] = arr[0].multiply(arr[1]);
//            arr[0] = arr[2];
//        }
//        System.out.println(arr[0]);
    }
}

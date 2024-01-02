import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON27433 {
    public static void main(String[] args) {
        BigInteger[] arr = new BigInteger[21];

        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(1);
        for(int i = 2; i <= 20; i++) {
            arr[i] = BigInteger.valueOf(i).multiply(arr[i - 1]);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arr[n]);

    }
}

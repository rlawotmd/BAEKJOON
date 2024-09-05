import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BAEKJOON1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();

        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        BigInteger n3 = new BigInteger(c);
        System.out.println(n1.modPow(n2, n3));
    }
}

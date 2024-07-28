import java.io.*;

public class BAEKJOON30224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = String.valueOf(n);
        if (s.contains("7") && n % 7 == 0) System.out.println(3);
        if (!s.contains("7") && n % 7 == 0) System.out.println(1);
        if (s.contains("7") && n % 7 != 0) System.out.println(2);
        if (!s.contains("7") && n % 7 != 0) System.out.println(0);

    }
}

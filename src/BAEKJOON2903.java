import java.io.*;

public class BAEKJOON2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));
    }
}
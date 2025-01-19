import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON26264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int s = 0;
        int b = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("s")) {
                s++;
            } else if (input.substring(i, i + 1).equals("b")) {
                b++;
            }
        }

        if (s > b) {
            System.out.println("security!");
        } else if (b > s) {
            System.out.println("bigdata?");
        } else if (s == b) {
            System.out.println("bigdata? security!");
        }
    }
}

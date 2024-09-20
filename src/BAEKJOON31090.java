import java.io.*;
import java.util.Scanner;

public class BAEKJOON31090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(br.readLine());
            if ((y + 1) % (y % 100) == 0) bw.write("Good\n");
            else bw.write("Bye\n");
        }
        bw.flush();
    }
}

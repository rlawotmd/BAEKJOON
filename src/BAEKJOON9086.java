import java.io.*;
import java.util.Scanner;

public class BAEKJOON9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        String a = null;
        String b = null;
        for(int i = 0; i < n; i++)
            words[i] = br.readLine();

        for(int i = 0; i < n; i++) {
            if(words[i].length() == 0) {
                a = words[i]; b = words[i];
            } else {
                a = words[i].substring(0, 1);
                b = words[i].substring(words[i].length() - 1);
            }
            System.out.println(a + b);
        }

    }
}

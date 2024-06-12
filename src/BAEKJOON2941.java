import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BAEKJOON2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int leng = s.length();
        while (s.contains("=") || s.contains("-") || s.contains("lj") || s.contains("nj")) {
            if (s.contains("c=")) {
                leng--;
                s = s.replace("c=", "a");
            }
            if (s.contains("c-")) {
                leng--;
                s = s.replace("c-", "a");
            }
            if (s.contains("dz=")) {
                leng--;
                s = s.replace("dz=", "a");
            }
            if (s.contains("d-")) {
                leng--;
                s = s.replace("d-", "a");
            }
            if (s.contains("s=")) {
                leng--;
                s = s.replace("s=", "a");
            }
            if (s.contains("z=")) {
                leng--;
                s = s.replace("z=", "a");
            }
            if (s.contains("z=")) {
                leng--;
                s = s.replace("z=", "a");
            }
            if (s.contains("lj")) {
                leng--;
                s = s.replace("lj", "a");
            }
            if (s.contains("nj")) {
                leng--;
                s = s.replace("nj", "a");
            }
        }
        System.out.println(s.length());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        while (s.contains("=") || s.contains("-") || s.contains("lj") || s.contains("nj")) {
            if (s.contains("c=")) {
                s = s.replace("c=", "a");
            }
            if (s.contains("c-")) {
                s = s.replace("c-", "a");
            }
            if (s.contains("dz=")) {
                s = s.replace("dz=", "a");
            }
            if (s.contains("d-")) {
                s = s.replace("d-", "a");
            }
            if (s.contains("s=")) {
                s = s.replace("s=", "a");
            }
            if (s.contains("z=")) {
                s = s.replace("z=", "a");
            }
            if (s.contains("z=")) {
                s = s.replace("z=", "a");
            }
            if (s.contains("lj")) {
                s = s.replace("lj", "a");
            }
            if (s.contains("nj")) {
                s = s.replace("nj", "a");
            }
        }
        System.out.println(s.length());
    }
}

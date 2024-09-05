import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON5211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0; // A D E
        int c = 0; // C F G
        boolean last = false; // T = A / F = C
        boolean get = false;
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                get = false;
                continue;
            }
            if (s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'E') {
                last = true;
                if (!get) {
                    a++;
                    get = true;
                }
            }
            if (s.charAt(i) == 'C' || s.charAt(i) == 'F' || s.charAt(i) == 'G') {
                last = false;
                if (!get) {
                    c++;
                    get = true;
                }
            }
            if (s.charAt(i) == 'B' || !get) {
                get = true;
            }

        }

        if (a > c) System.out.println("A-minor");
        else if (c > a) System.out.println("C-major");
        else {
            if (last) System.out.println("A-minor");
            else System.out.println("C-major");
        }
    }
}
// CD|EC|CD|EC|EF|G|EF|G|GAGF|EC|GAGF|EC|CG|C|AG|BAC
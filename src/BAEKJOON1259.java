import java.io.*;

public class BAEKJOON1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        boolean isit;
        while (true) {
            isit = false;
            s = br.readLine();
            if (s.charAt(0) == '0' && s.length() == 1) break;

            if ((Integer.parseInt(s) >= 1 && (Integer.parseInt(s) <= 9))) {
                isit = true;
            } else {
                for (int i = 0; i < s.length() / 2; i++) {
                    if (s.charAt(i) == s.charAt(s.length() - 1 - i) && s.charAt(0) != '0') {
                        isit = true;
                    } else {
                        isit = false;
                        break;
                    }
                }
            }
            if (isit) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
    }
}

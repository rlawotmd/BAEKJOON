import java.io.*;

public class BAEKJOON10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = new String[5];
        int max = -1;

        for (int i = 0; i < 5; i++) {
            s[i] = br.readLine();
            max = Math.max(max, s[i].length());
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (s[j].length() > i) {
                    bw.write(s[j].charAt(i) + "");
                }
            }
        }

        bw.flush();
    }
}

import java.io.*;

public class BAEKJOON2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] s = br.readLine().split(" ");
            String name = s[0];
            int n = Integer.parseInt(s[1]);
            int m = Integer.parseInt(s[2]);
            if (name.equalsIgnoreCase("#") && n == 0 && m == 0) break;
            else if (n > 17) {
                bw.write(name + " Senior\n");
            } else if (m >= 80) {
                bw.write(name + " Senior\n");
            } else bw.write(name + " Junior\n");
        }
        bw.flush();
    }
}

import java.io.*;

public class BAEKJOON11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        for(int i = 0; i < s.length(); i = i + 10) {
            if(i + 10 > s.length()) {
                bw.write(s.substring(i) + "\n");
            } else {
                bw.write(s.substring(i, i + 10) + "\n");
            }
        }
        bw.flush();
    }
}

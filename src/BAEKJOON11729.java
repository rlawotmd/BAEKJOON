import java.io.*;

public class BAEKJOON11729 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int Hanoi(int n, int from, int tmp, int to) throws IOException {
        if(n == 1) {
            bw.write(from + " " + to + "\n");
            return 0;
        }
        Hanoi(n - 1, from, to, tmp);
        bw.write(from + " " + to + "\n");
        Hanoi(n - 1, tmp, from, to);
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int from = 1;
        int tmp = 2;
        int to = 3;
        System.out.println((int)(Math.pow(2, n) - 1));
        Hanoi(n, from, tmp, to);
        bw.flush();
    }
}

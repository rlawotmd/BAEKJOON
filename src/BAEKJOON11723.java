import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON11723 {
    static class MyList {
        int[] arr;
        MyList() {
            arr = new int[21];
        }
        void add(int n) {
            arr[n] = 1;
        }

        void remove(int n) {
            arr[n] = 0;
        }

        int check(int n) {
            if (arr[n] == 1) return 1;
            else return 0;
        }

        void toggle(int n) {
            if (arr[n] == 1) arr[n] = 0;
            else arr[n] = 1;
        }

        void all() {
            for (int i = 1; i <= 20; i++) {
                arr[i] = 1;
            }
        }

        void empty() {
            arr = new int[21];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        MyList ml = new MyList();
        int num = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (s) {
                case "add":
                    ml.add(num);
                    break;
                case "remove":
                    ml.remove(num);
                    break;
                case "check":
                    bw.write(ml.check(num) + "\n");
                    break;
                case "toggle":
                    ml.toggle(num);
                    break;
                case "all":
                    ml.all();
                    break;
                case "empty":
                    ml.empty();
                    break;
            }
        }
        bw.flush();
    }
}

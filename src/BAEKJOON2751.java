import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BAEKJOON2751 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> new_arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            new_arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(new_arr);

        for(int i = 0; i < n; i++) {
            bw.write(new_arr.get(i).toString() + "\n");
        }

        bw.flush();
    }
}

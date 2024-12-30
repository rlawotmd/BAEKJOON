import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON11034 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            int[] kang = new int[3];
            st = new StringTokenizer(str, " ");
            for (int i = 0; i < 3; i++) {
                kang[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(kang[1] - kang[0] > kang[2] - kang[1] ? kang[1] - kang[0] - 1 : kang[2] - kang[1] - 1);
        }
    }

}
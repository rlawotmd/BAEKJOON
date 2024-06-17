import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();
        char[] myarr = new char[m];
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int ans = 0;

        int cnt_A = 0, cnt_C = 0, cnt_G = 0, cnt_T = 0;

        for (int i = 0; i < m; i++) {
            myarr[i] = arr[i];
            if (arr[i] == 'A') cnt_A++;
            else if (arr[i] == 'C') cnt_C++;
            else if (arr[i] == 'G') cnt_G++;
            else if (arr[i] == 'T') cnt_T++;
        }

        if (cnt_A >= A && cnt_C >= C && cnt_G >= G && cnt_T >= T) ans++;
        int point = 0;
        for (int i = 0; i <= n - m - 1; i++) {
            if (arr[i + m] == 'A') cnt_A++;
            else if (arr[i + m] == 'C') cnt_C++;
            else if (arr[i + m] == 'G') cnt_G++;
            else if (arr[i + m] == 'T') cnt_T++;

            if (myarr[point] == 'A') cnt_A--;
            else if (myarr[point] == 'C') cnt_C--;
            else if (myarr[point] == 'G') cnt_G--;
            else if (myarr[point] == 'T') cnt_T--;

            myarr[point++] = arr[i + m];

            if (point >= m) point = 0;

            if (cnt_A >= A && cnt_C >= C && cnt_G >= G && cnt_T >= T) ans++;
        }

        System.out.println(ans);
    }
}

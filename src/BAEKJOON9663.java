import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON9663 {
    static int n;
    static int[] a;
    static int ans;

    static boolean able(int No) {
        for (int i = 0; i < No; i++) {
            if (a[No] == a[i] || Math.abs(a[No] - a[i]) == No - i) return false;
        }
        return true;
    }

    static void queen(int No) {
        if (No == n) {
            ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
            a[No] = i;
            if (able(No)) queen(No + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        ans = 0;

        queen(0);

        System.out.println(ans);
    }
}

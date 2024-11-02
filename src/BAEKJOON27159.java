import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON27159 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[36];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[Integer.parseInt(st.nextToken())]++;
        int sum = 0;
        for (int i = 3; i <= 35; i++) {
            if (arr[i-1] == 0 && arr[i] != 0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
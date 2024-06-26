import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int remove = (int) Math.round(n * 0.15);

        double sum = 0;
        int cnt = 0;
        Arrays.sort(arr);
        for (int i = remove; i < n - remove; i++) {
            sum += arr[i];
            cnt++;
        }
        System.out.println((int) Math.round(sum / cnt));
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BAEKJOON6840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        a[0] = Integer.parseInt(br.readLine());
        a[1] = Integer.parseInt(br.readLine());
        a[2] = Integer.parseInt(br.readLine());

        Arrays.sort(a);
        System.out.println(a[1]);
    }
}

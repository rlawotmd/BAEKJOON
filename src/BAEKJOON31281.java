import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON31281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}

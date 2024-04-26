import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON13866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Math.max(arr[0] + arr[3], arr[1] + arr[2]) - Math.min(arr[0] + arr[3], arr[1] + arr[2]));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON14656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        int ans = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] != sortArr[i]) {ans++;}
        }

        System.out.println(ans);
    }
}

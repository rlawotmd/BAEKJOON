import java.util.Scanner;

public class BAEKJOON17530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        if (max == arr[0]) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

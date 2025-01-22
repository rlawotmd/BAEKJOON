import java.util.Scanner;

public class BAEKJOON17210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        int[] arr = new int[6];
        arr[0] = m;
        for (int i = 1; i < 6; i++) {
            arr[i] = 1 - m;
            m = arr[i];
        }

        if (n > 5) {
            System.out.println("Love is open door");
            return;
        } else {
            for (int i = 1; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

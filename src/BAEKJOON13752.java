import java.util.Scanner;

public class BAEKJOON13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            for(int j = 0; j < num; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class BAEKJOON26209 {
    static void fuc() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n != 0 && n != 1) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
    public static void main(String[] args) {
        fuc();
    }
}

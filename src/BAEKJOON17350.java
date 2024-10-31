import java.util.Scanner;

public class BAEKJOON17350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean f = false;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.equals("anj")) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("뭐야;");
        } else System.out.println("뭐야?");
    }
}

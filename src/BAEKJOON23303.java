import java.util.Scanner;

public class BAEKJOON23303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("D2") || s.contains("d2")) {
            System.out.println("D2");
        } else System.out.println("unrated");
    }
}

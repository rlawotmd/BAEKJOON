import java.util.Scanner;

public class BAEKJOON14581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = ":fan::fan::fan:\n" + ":fan::";
        String word = sc.nextLine();
        s = s + word + "::fan:\n" + ":fan::fan::fan:";
        System.out.println(s);
    }
}

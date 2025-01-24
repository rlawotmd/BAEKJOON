import java.util.HashSet;
import java.util.Scanner;

public class BAEKJOON32710 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                set.add(i * j);
                set.add(j);
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (set.contains(n)) System.out.println(1);
        else System.out.println(0);
    }
}

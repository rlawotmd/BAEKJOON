import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BAEKJOON28431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (s.contains(n)) s.remove(n);
            else s.add(n);
            a.add(n);
        }

        for (int i = 0; i < 5; i++) {
            if (s.contains(a.get(i))) {
                System.out.println(a.get(i));
                break;
            }
        }
    }
}

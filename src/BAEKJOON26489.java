import java.util.ArrayList;
import java.util.Scanner;

public class BAEKJOON26489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        System.out.println(list.size());

    }
}

import java.util.Scanner;

public class BAEKJOON28290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("fdsajkl;") || s.equals("jkl;fdsa")) {
            System.out.println("in-out");
        } else if (s.equals("asdf;lkj") || s.equals(";lkjasdf")) {
            System.out.println("out-in");
        } else if (s.equals("asdfjkl;")) System.out.println("stairs");
        else if (s.equals(";lkjfdsa")) System.out.println("reverse");
        else System.out.println("molu");
    }
}

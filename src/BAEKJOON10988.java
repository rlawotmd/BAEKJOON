import java.util.Scanner;

public class BAEKJOON10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        String re_s = sb.reverse().toString();

        if (s.equals(re_s)) System.out.println(1);
        else System.out.println(0);
    }
}

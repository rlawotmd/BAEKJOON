import java.util.Scanner;

public class BAEKJOON28074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean is = false;
        if(s.contains("M")) {
            if(s.contains("O")) {
                if(s.contains("B")) {
                    if(s.contains("I")) {
                        if(s.contains("S")) {
                            is = true;
                        }
                    }
                }
            }
        }
        if(is == true) System.out.println("YES");
        else System.out.println("NO");
    }
}

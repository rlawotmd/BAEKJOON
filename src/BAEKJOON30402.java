import java.util.Scanner;

public class BAEKJOON30402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String name = new String();
        for(int i = 0; i < 15; i++) {
            s = sc.nextLine();
            if(s.contains("w")) name = "chunbae";
            if(s.contains("b")) name = "nabi";
            if(s.contains("g")) name = "yeongcheol";
        }
        System.out.println(name);
    }
}

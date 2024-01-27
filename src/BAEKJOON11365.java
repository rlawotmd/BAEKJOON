import java.util.Scanner;

public class BAEKJOON11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("END")) System.exit(0);
            for(int i = 1; i <= s.length(); i++) {
                System.out.print(s.charAt(s.length() - i));
            }
            System.out.println();
        }
    }
}

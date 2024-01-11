import java.util.Scanner;

public class BAEKJOON30676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 620 && n <= 780) System.out.println("Red");
        if(n >= 590 && n < 620) System.out.println("Orange");
        if(n >= 570 && n < 590) System.out.println("Yellow");
        if(n >= 495 && n < 570) System.out.println("Green");
        if(n >= 450 && n < 495) System.out.println("Blue");
        if(n >= 425 && n < 450) System.out.println("Indigo");
        if(n >= 380 && n < 425) System.out.println("Violet");
    }
}

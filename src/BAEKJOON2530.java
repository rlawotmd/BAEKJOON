import java.util.Scanner;

public class BAEKJOON2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int time = sc.nextInt();
        sec = sec + time;
        min = min + (sec / 60);
        sec = sec % 60;
        hour = hour + (min / 60);
        min = min % 60;
        hour = hour % 24;
        System.out.println(hour + " " + min + " " + sec);
    }
}

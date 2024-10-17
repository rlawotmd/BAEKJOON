import java.util.Scanner;

public class BAEKJOON32314 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int m = sc.nextInt();
    if (n <= k / m) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

}

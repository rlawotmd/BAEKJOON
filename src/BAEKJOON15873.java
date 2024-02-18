import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON15873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = {1, 1, 1, 1};
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            //System.out.println(arr[i]);
        }
        if (s.length() == 2) {
            System.out.println((arr[0] + arr[1]));
        }
        if (s.length() == 3) {
            if(arr[1] == 0) {
                arr[0] = arr[0] * 10;
                System.out.println((arr[0] + arr[2]));
            }
            if(arr[2] == 0) {
                arr[1] = arr[1] * 10;
                System.out.println((arr[0] + arr[1]));
            }
        }
        if (s.length() == 4) {
            System.out.println(20);
        }
    }
}

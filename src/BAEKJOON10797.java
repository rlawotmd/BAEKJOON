import java.util.*;

public class BAEKJOON10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        int num = 0;
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if(n == arr[i]) num++;
        }
        System.out.println(num);
    }
}

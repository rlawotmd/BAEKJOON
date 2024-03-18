import java.util.*;

public class BAEKJOON1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String s = sc.nextLine();
        String upper = s.toUpperCase();
        //System.out.println(upper);
        for(int i = 0; i < upper.length(); i++) {
            int j = upper.charAt(i) - 'A';
            arr[j]++;
        }

        int loc = 0;
        int max = 0;
        int cnt = 0;

        for(int i = 0; i < 26; i++) {
            if(arr[i] == max) {
                max = arr[i];
                cnt += 1;
            }
            if(max < arr[i]) {
                max = arr[i];
                cnt = 0;
                loc = i;
            }
        }
        
        if(cnt >= 1) System.out.println("?");
        else System.out.println((char) (loc + 'A'));

    }
}

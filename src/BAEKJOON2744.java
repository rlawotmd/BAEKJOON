import java.io.*;
import java.util.*;

public class BAEKJOON2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) ans = ans + Character.toLowerCase(c);
            if(Character.isLowerCase(c)) ans = ans + Character.toUpperCase(c);
        }
        System.out.println(ans);
    }
}

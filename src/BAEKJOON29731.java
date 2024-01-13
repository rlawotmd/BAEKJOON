import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BAEKJOON29731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isit = true;
        String[] arr = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};
        List<String> strarr = new ArrayList<>(Arrays.asList(arr));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            if(!strarr.contains(br.readLine())) isit = false;
        }
        if(isit == false) System.out.println("Yes");
        else System.out.println("No");
    }
}

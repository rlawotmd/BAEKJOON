import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals("A+")) System.out.println(4.3);
        if(s.equals("A0")) System.out.println(4.0);
        if(s.equals("A-")) System.out.println(3.7);
        if(s.equals("B+")) System.out.println(3.3);
        if(s.equals("B0")) System.out.println(3.0);
        if(s.equals("B-")) System.out.println(2.7);
        if(s.equals("C+")) System.out.println(2.3);
        if(s.equals("C0")) System.out.println(2.0);
        if(s.equals("C-")) System.out.println(1.7);
        if(s.equals("D+")) System.out.println(1.3);
        if(s.equals("D0")) System.out.println(1.0);
        if(s.equals("D-")) System.out.println(0.7);
        if(s.equals("F")) System.out.println(0.0);
    }
}

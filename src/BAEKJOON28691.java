import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON28691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals("M")) System.out.println("MatKor");
        if(s.equals("W")) System.out.println("WiCys");
        if(s.equals("C")) System.out.println("CyKor");
        if(s.equals("A")) System.out.println("AlKor");
        if(s.equals("$")) System.out.println("$clear");
    }
}

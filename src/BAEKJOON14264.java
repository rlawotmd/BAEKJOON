import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON14264 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Integer.parseInt(br.readLine());
        double area = (Math.sqrt(3) / 4) * Math.pow(N, 2);
        System.out.println(area);
    }
}
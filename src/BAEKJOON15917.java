import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON15917 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numQ = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < numQ; i++) {
            long number = Integer.parseInt(br.readLine());

            if ((number & (number - 1)) == 0){
                answer = 1;
            }else{
                answer = 0;
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
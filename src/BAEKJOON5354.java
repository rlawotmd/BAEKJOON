import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON5354 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    if(j == 1 || j ==n) {
                        System.out.print("#");
                    }else {
                        if(k == 1 || k == n) {
                            System.out.print("#");
                        }else {
                            System.out.print("J");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
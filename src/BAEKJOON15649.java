import java.util.*;
import java.io.*;

public class BAEKJOON15649 {
    static int N, R;
    static int[] a;
    static int[] b;
    static boolean[] v;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static void perm(int cnt) throws Exception {
        if (cnt == R) {
            for (int i = 0; i < R; i++) {
                bw.write(b[i] + " ");
            }
            bw.write("\n");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (v[i]) continue;
            v[i] = true;
            b[cnt] = a[i];
            perm(cnt + 1);
            v[i] = false;
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        
        a = new int[N];
        b = new int[R];
        v = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = i + 1;
            v[i] = false;
        }
        
        perm(0);
        
        bw.flush();
        
        
    }
}

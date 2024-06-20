import java.util.*;
import java.io.*;

public class BAEKJOON10974 {
    static int N;
    static int[] a;
    static int[] b;
    static boolean[] v;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static void perm(int cnt) throws Exception {
        if (cnt == N) {
            for (int i = 0; i < N; i++) {
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
        N = Integer.parseInt(br.readLine());
        
        a = new int[N];
        b = new int[N];
        v = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = i + 1;
            v[i] = false;
        }
        
        perm(0);
        
        bw.flush();
        
        
    }
}

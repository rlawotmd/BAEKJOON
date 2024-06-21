import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BAEKJOON15650 {
	static int N, R;
	static int[] a, b;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static void comb(int cnt, int start) throws Exception {
		if (cnt == R) {
			for (int i : b) bw.write(i + " ");
			bw.write("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			b[cnt] = a[i];
			comb(cnt + 1, i + 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		a = new int[N];
		b = new int[R];
		for (int i = 0; i < N; i++) {
			a[i] = i + 1;
		}
		
		comb(0, 0);
		bw.flush();
	}
}

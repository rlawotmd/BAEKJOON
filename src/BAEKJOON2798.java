import java.io.*;
import java.util.*;

public class BAEKJOON2798 {
	static int N, SUM = 0, MAX;
	static int[] a, b = new int[3];
	
	static void comb(int cnt, int start) {
		if (cnt == 3) {
			int sum = 0;
			for (int i : b) sum += i;
			if (sum > MAX) return;
			SUM = Math.max(SUM, sum);
			return;
		}
		for (int i = start; i < N; i++) {
			b[cnt] = a[i];
			comb(cnt + 1, i + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		MAX = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		comb(0, 0);
		System.out.println(SUM);
	}
}

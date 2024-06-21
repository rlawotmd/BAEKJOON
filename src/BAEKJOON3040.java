import java.util.*;
import java.io.*;

public class BAEKJOON3040 {
	static int[] a;
	static int[] b;
	static int[] ans;
	
	static void comb(int cnt, int start) {
		if (ans != null) return;
		if (cnt == 7) {
			int sum = 0;
			for (int i : b) sum += i;
			if (sum != 100) return;
			ans = b.clone();
			return;
		}
		
		for (int i = start; i < 9; i++) {
			b[cnt] = a[i];
			comb(cnt + 1, i + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = new int[9];
		b = new int[7];
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
		}
		comb(0, 0);
		for (int j : ans) System.out.println(j);
	}
}

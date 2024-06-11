import java.util.Scanner;

public class BAEKJOON25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr_1 = new double[20];
        double sum_1 = 0;
        double[] arr_2 = new double[20];
        double sum_2 = 0;

        for (int i = 0; i < 20; i++) {
            String s = sc.next();
            arr_1[i] = sc.nextDouble();
            s = sc.next();
            switch (s) {
                case "A+" : arr_2[i] = 4.5; break;
                case "A0" : arr_2[i] = 4.0; break;
                case "B+" : arr_2[i] = 3.5; break;
                case "B0" : arr_2[i] = 3.0; break;
                case "C+" : arr_2[i] = 2.5; break;
                case "C0" : arr_2[i] = 2.0; break;
                case "D+" : arr_2[i] = 1.5; break;
                case "D0" : arr_2[i] = 1.0; break;
                case "F" : arr_2[i] = 0.0; break;
                case "P" : continue;
            }
            sum_1 += arr_1[i];
            sum_2 += arr_1[i] * arr_2[i];
        }
        System.out.println(sum_2 / sum_1);
    }
}

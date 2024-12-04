import java.util.*;

public class BAEKJOON29097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int warriorsJoffrey = n * a;
        int warriorsRobb = m * b;
        int warriorsStannis = k * c;

        int maxWarriors = Math.max(warriorsJoffrey, Math.max(warriorsRobb, warriorsStannis));

        List<String> strongestKings = new ArrayList<>();

        if (warriorsJoffrey == maxWarriors) {
            strongestKings.add("Joffrey");
        }
        if (warriorsRobb == maxWarriors) {
            strongestKings.add("Robb");
        }
        if (warriorsStannis == maxWarriors) {
            strongestKings.add("Stannis");
        }

        Collections.sort(strongestKings);

        for (int i = 0; i < strongestKings.size(); i++) {
            System.out.print(strongestKings.get(i));
            if (i < strongestKings.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

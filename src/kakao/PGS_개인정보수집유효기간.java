package kakao;

import java.util.*;

public class PGS_개인정보수집유효기간 {
    static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        List<Integer> ansList = new ArrayList<>();

        String[] todayIs = today.split("\\.");
        System.out.println(Arrays.toString(todayIs));
        int todayYear = Integer.parseInt(todayIs[0]);
        int todayMonth = Integer.parseInt(todayIs[1]);
        int todayDay = Integer.parseInt(todayIs[2]);

        todayMonth += (todayYear * 12);
        todayDay += (todayMonth * 28);

        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : terms) {
            String[] arr = s.split(" ");
            hm.put(arr[0], Integer.parseInt(arr[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String s = privacies[i];
            String[] arr = s.split(" ");
            String[] date = arr[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            month += hm.get(arr[1]);
            month += (year * 12);
            day += (month * 28);
            day--;
            if (todayDay < day) ansList.add(i + 1);

        }

        answer = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        System.out.println(solution(today, new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}));
    }
}

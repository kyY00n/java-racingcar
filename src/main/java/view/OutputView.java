package view;

import java.util.List;

public class OutputView {
    //TODO : 적절한 네이밍 변경하기
    public static void printResultTitle() {
        System.out.println("실행 결과");
    }

    public static void printStatus(List<String> statuses) {
        for (String status : statuses) {
            System.out.println(status);
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.print(String.join(", ", winners));
        System.out.print("가 최종 우승했습니다.");
    }
}

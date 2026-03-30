package Week1;

import java.util.Scanner;

public class LionBonus {

    LionBonus() {

    }
    Scanner input = new Scanner(System.in);

    // 상수는 관례에 따라 대문자(UPPER_SNAKE_CASE)로 수정
    final static String LION_EMOJI = "\uD83E\uDD81 ";
    final static String WELCOME_COMMENT = "저장할 아기사자 수를 5 이상으로 입력해주세요.";
    final static String ERROR_NUMBER_COMMENT = "[오류] 5 이상 입력해주세요.";
    final static String ERROR_INT_COMMENT = "[오류] 숫자만 입력해주세요.";
    final static String LION_NAME_REQUEST = "아기사자 이름을 입력해주세요";
    final static String LION_LIST_COMMENT = "\n[최종 아기사자 명단]";
    final static String EXIT = "exit", RESTART = "restart";
    final static String ASK_RESTART = "프로그램을 종료하시려면 "+EXIT+"를 입력하세요.\n계속 아기사자를 등록하려면 "+RESTART+"를 입력하세요.\n";

    String[] lionNames = null;
    int lionNum = 0;

    public void run() {
        do{
            inputLionNumber();
            inputLionNames();
            printLionNames();
        }while (isRetry());
    }

    public void inputLionNumber() {
        while(true) {
            System.out.println(LION_EMOJI + WELCOME_COMMENT);
            if(input.hasNextInt()) {
                lionNum = input.nextInt();
                input.nextLine();
                if(lionNum < 5) {
                    System.out.println(ERROR_NUMBER_COMMENT);
                    continue;
                }
                return;
            }
            else {
                input.nextLine();
                System.out.println(ERROR_INT_COMMENT);
            }
        }
    }

    public void inputLionNames() {
        lionNames = new String[lionNum];
        System.out.println(LION_NAME_REQUEST);
        for (int i = 0; i < lionNum; i++) {
            lionNames[i] = input.nextLine();
        }
    }

    public void printLionNames() {
        System.out.println(LION_LIST_COMMENT);
        for (int i = 0; i < lionNum; i++) {
            System.out.println((i + 1) + ". " + lionNames[i]);
        }
    }
    public boolean isRetry() {
        while (true) {
            System.out.println(ASK_RESTART);

            String tmp = input.nextLine();
            if (tmp.equals(RESTART))
                return true;
            else if (tmp.equals(EXIT))
                return false;
        }
    }

}

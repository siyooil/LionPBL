package Week1;

import java.util.Scanner;

public class Lion {
    Lion () {

    }
    Scanner input = new Scanner(System.in);

    // 상수는 관례에 따라 대문자(UPPER_SNAKE_CASE)로 수정
    final static String LION_EMOJI = "\uD83E\uDD81 ";
    final static String WELCOME_COMMENT = "저장할 아기사자 수를 5 이상으로 입력해주세요.";
    final static String ERROR_NUMBER_COMMENT = "[오류] 5 이상 입력해주세요.";
    final static String LION_NAME_REQUEST = "아기사자 이름을 입력해주세요";
    final static String LION_LIST_COMMENT = "\n[최종 아기사자 명단]";

    String[] lionNames = null;
    int lionNum = 0;

    public void run() {
        // 불필요한 this. 제거
        if(!isValidLionNumberInput())
            printErrorMessage();
        else{
            inputLionNames();
            printLionNames();
        }
    }


    public boolean isValidLionNumberInput() {
        System.out.println(LION_EMOJI + WELCOME_COMMENT);
        lionNum = input.nextInt(); // shadowing(중복 선언)이 없으므로 this 없이 필드에 바로 저장 가능
        input.nextLine(); // 버퍼 비우기

        return lionNum >= 5;
    }

    public void printErrorMessage() {
        System.out.println(ERROR_NUMBER_COMMENT);
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
}

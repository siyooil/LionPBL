import java.util.Scanner;

public class study0330 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;

    while(true) {
      System.out.print("저장할 아기사자 수를 5 이상 입력해주세요. ");
      num = Integer.parseInt(scanner.nextLine()); //사람 몇 명인지 num에 입력받아 저장
      if (num < 5) {
        System.out.println("[오류] 5 이상 입력해주세요");
      } else{
        break;
      }
    }
      String[] names = new String[num];

      for (int i = 0; i < names.length; i++) {
        System.out.print((i + 1) + "번째 아기사자: ");
        names[i] = scanner.nextLine(); //입력받은 문자열(이름) names 배열에 저장
      }
      System.out.println("\n-저희는 lion-babies입니다-\n");
      for(int i=0; i < names.length; i++){
        System.out.println("저는 아기사자 " + names[i] + "입니다 ㅎㅎ");
      }
  }
}

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {
            System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
            n = sc.nextInt();

            if (n >= 5) break;
            else System.out.println(("5 이상 입력해야 합니다."));
        }
        sc.nextLine();

        String[] name = new String[n];

        System.out.println("아기사자 이름을 입력해주세요.");
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + name[i]);
        }
        sc.close();
    }
}



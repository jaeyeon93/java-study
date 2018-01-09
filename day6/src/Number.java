import java.util.*;

public class Number {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다.");
        System.out.println("숫자를 입력해 주세요 1-100");
        int input = s.nextInt();
        // 입력받을 숫자.

        while(true) {
            int second = s.nextInt();

            if (input > second) {
                System.out.print(second + "보다 커요.");
                count++;
            } else if (input < second) {
                System.out.println(second + "보다 작아요.");
                count++;
            } else if (input == second) {
                System.out.println(count+"번만에 맞췄습니다.");
                System.out.println("플레이해 주셔서 감사합니다.");
                break;
            }
        }

    }
}

import java.util.Scanner;

public class Input {
    static int getFirstValue(Scanner scanner) {
        // get first value
        System.out.print("초기값 :  ");
        int first = scanner.nextInt();
        return first;
    }

    static int getSecondValue(Scanner scanner) {
        // get second value
        System.out.print("입력 값 :  ");
        int second = scanner.nextInt();
        return second;
    }

    static String getSymbol(Scanner scanner) {
        System.out.print("기호 : ");
        String symbol = scanner.next();
        return symbol;
    }
}
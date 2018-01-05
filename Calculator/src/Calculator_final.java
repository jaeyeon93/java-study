import java.util.Scanner;

public class Calculator_final {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할값 입력 : ");

        String value = scanner.nextLine();
        // 입력한 값을 숫자로 받는다.
        System.out.println("입력 값 : " + value);
        String[] values = value.split(" ");
        // inputValue를 눈다.
        int first = Integer.parseInt(values[0]);

        int result = first;

        for (int i = 1; i < values.length; i+=2 ){
            String symbol = values[i];
            System.out.println("symbol : " + symbol);

            int second = Integer.parseInt(values[i+1]);

            result = Calculator.calculate(symbol, result, second);
        }
    Output.print(result);
    }
}
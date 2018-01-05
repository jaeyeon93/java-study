import java.util.Scanner;

public class Calculator {

	static int calculate(String symbol , int first , int second) {
		// calculate
		int result = first;
		if ("+".equals(symbol)) {
			result = first + second;
			System.out.println("덧셈결과 : " + result);
		} else if ("-".equals(symbol)) {
			result = first - second;
			System.out.println("뺄셈결과 : " + result);
		} else if ("*".equals(symbol)) {
			result = first * second;
			System.out.println("곱셈결과 : " + result);
		} else if ("/".equals(symbol)) {
			result = first / second;
			System.out.println("나눗셈결과 : " + result);
		} else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}
		return result;
	}

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int first = Input.getFirstValue(scanner);
		int result = first;

		while (true) {
			String symbol = Input.getSymbol(scanner);
			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(symbol, result, second);
		}
		scanner.close();
	}
}

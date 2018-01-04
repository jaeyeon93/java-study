import java.util.Scanner;

public class Calculator {
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

	static void print (int result) {
		// print result
		System.out.println(result);
	}

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int first = getFirstValue(scanner);
		int result = first;

		while (true) {
			String symbol = getSymbol(scanner);
			if (symbol.equals("quit")) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);

			result = calculate(symbol, result, second);
		}
		scanner.close();
	}
}

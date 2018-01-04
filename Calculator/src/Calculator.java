import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("초기값 :  ");
		int first = scanner.nextInt();
		System.out.println(first);

		int result = first;
		while (true) {
			System.out.print("기호 : ");
			String symbol = scanner.next();
			System.out.println(symbol);

			if (symbol.equals("quit")) {
				System.out.println("최종결과값 : "+ result);
				break;
			}

			System.out.print("입력 값 :  ");
			int input = scanner.nextInt();
			System.out.println(input);



			if ("+".equals(symbol)) {
				System.out.println("덧셈결과 : " + (result+=input));
			} else if ("-".equals(symbol)) {
				System.out.println("뺄셈결과 : " + (result-=input));
			} else if ("*".equals(symbol)) {
				System.out.println("곱셈결과 : " + (result*=input));
			} else if ("/".equals(symbol)) {
				System.out.println("나눗셈결과 : " + (result/=input));
			} else {
				System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
			}
		}
	}
}

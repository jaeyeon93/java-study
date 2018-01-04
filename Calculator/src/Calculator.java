import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 :  ");
		int first = scanner.nextInt();
		System.out.println(first);
		// alt + command + 아래화살표 하면 바로밑에 복사됨.
		
		System.out.println("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + (first / second));
	}
}

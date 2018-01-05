import java.util.Scanner;

public class gugudan_final {
	public static void main (String args []) {
		System.out.println("구구단 중 출력할 단은 ?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : "+number);
		
		
		// 구구단 출력 예제 구현;
		for (int i = 2; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				int result = i * j;
				System.out.println(result);
			}
			System.out.println("=====================");
		}
	}		
}

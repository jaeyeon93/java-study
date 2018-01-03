import java.util.Scanner;
// input the number from user
// scanner는 JDK에서 제공을 해주는것이다. 

public class gugudan {
	public static void main (String args []) {
		System.out.println("구구단 중 출력할 단은 ?");
		/*
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : "+number);
		
		if (number < 2) {
			System.out.println("2이상, 9이의 값만 입력할 수 있습니다.");
		} else if (number > 9) {
			System.out.println("2이상, 9이의 값만 입력할 수 있습니다.");
		} else {
			// 구구단 출력 예제 구현;
			for (int i = number; i < 10; i++) {
					int result = i * number;
					System.out.println(result);

				}
			}
		*/
		int [] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = 2 * (i+1);
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			}	
		}		
}

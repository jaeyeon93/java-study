import java.util.Scanner;
// input the number from user
// scanner는 JDK에서 제공을 해주는것이다. 

public class gugudan {
	public static void main (String args []) {
		System.out.println("구구단 중 출력할 단은 ?");
		Scanner scanner = new Scanner(System.in);
		// make scanner object
		int number = scanner.nextInt();
		//System.out.println(number+ "");
		
		// 구구단 출력 예제 구현;
		for (int i = 1; i < 10; i++) {
			int result = number * i;
			System.out.println(result);
		}
	}
}

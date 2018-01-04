import java.util.Scanner;

public class gugudan_final2 {
	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		// 입력한 값을 숫자로 받는다.
		String [] splitedValue = inputValue.split(",");
		// inputValue를 눈다.
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		// 구구단 출력 예제 구현;
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				int result = i * j;
				System.out.println(result);
			}
			System.out.println("=====================");
		}
	}		
}

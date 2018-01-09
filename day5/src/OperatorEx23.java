public class OperatorEx23 {
    public static void main(String [] args) {
        if (10 == 10.f) {
            // int10이 더 큰 범위를 같은 float로 변환을 한다음 값을 비교를 한다.
            // 그러므로 참값이 나온다
            System.out.println("10과 10.0f는 같다.");
        }

        if ('0' != 0) {
            System.out.println("'0' 0은 같지않다.");
        }

        if ('A' == 65) {
            System.out.println("A는 65와 같다.");
        }

        int num = 5;

        if (num > 0 && num < 9) {
            System.out.println("5는 0보다 크고, 9보다는 작다");
        }
    }
}

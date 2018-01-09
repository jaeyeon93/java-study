public class OperatorEx17 {
    public static void main(String [] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        // 1st (pi * 1000)이 가장먼저 수행 => 3141.592f
        // 2nd 3141.592f를 int형으로 변환. => 3141
        // 3rd int와 float의 연산자이므로 int가 float로 변한다
        // 4th 3141.of / 1000f
        // 5th 3.141f

        System.out.print(shortPi);
    }
}

public class Exercise6_2 {
    public static void main (String [] args) {
        // step2
        SutdaCard card1 = new SutdaCard(3, false);
        // card1은 매개변수가 전달되기때문에 매개변수가 있는 생성자를 만들어야 한다.
        SutdaCard card2 = new SutdaCard();
        // card2는 매개변수가 전달되지 않기때문에 기본생성자를 만들어야한다.

        System.out.println(card1.info());
        System.out.println(card2.info());
        // step3
        // 출력값 3, 1K를 보고 info메서드를 만들어야한다.
        // Card1의 매개변수로 3과 false를 던지고
        // Card2는 매개변수를 던지지 않는다.
    }
}

class SutdaCard {
    int num;
    boolean isKwang;
    // step1
    SutdaCard() {
        this.num = 1;
        this.isKwang = true;
        // 매개변수가 없는 생성자는 위와 같이 this를 이용해서 인스턴스를 초기화를 시킬 수 있다.
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
        // 매개변수가 있는 생성자는
    }
// 위의 코드에서 생성자를 2개 정의하고 있다(오버로딩), 한개는 매개변수가 없는생성자, 한개는 매개변수가 있는 생성자.

    //step4
    public String info() {
        if (num == 1){
            return num + "K";
        } else {
            return num + "";
        }
    }

}

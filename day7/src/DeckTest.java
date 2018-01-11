class DeckTest {
    public static void main(String [] args){
        Deck d = new Deck();
        Card c = new Card();
        System.out.println(c);
        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card c[] = new Card[CARD_NUM];

    Deck() { // Deck 카드를 초기화한다
        int i = 0;

        for(int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 1; n < Card.NUM_MAX; n++) {
                c[i++] = new Card(k, n);
            }
        }
    }

    Card pick(int index) { // 지정된 위치(index)에 있는 카드를 하나 선택
        if (0 <= index && index < CARD_NUM)
            return c[index];
         else
            return pick();
         }

    Card pick() { // Deck에서 카드 하나를 선택
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle(){
        for(int n = 0; n < 1000; n++){
            int i = (int)(Math.random()*CARD_NUM);
            Card temp = c[0];
            c[0] = c[i];
            c[i] = temp;
        }
    }
} // Deck 클래스 끝;

class Card {
    static final int KIND_MAX = 4; // 카드 무늬 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMON = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String kind = "";
        String number = "";

        switch (this.kind){
            case 4:
                kind = "SPADE";
                break;
            case 3:
                kind = "DIAMOND";
                break;
            case 2:
                kind = "HEART";
                break;
            case 1:
                kind = "CLOVER";
                break;
            default:
        }

        switch (this.number){
            case 13:
                number = "K";
                break;
            case 12:
                number = "Q";
                break;
            case 11:
                number = "J";
                break;
            default:
                number = this.number + "";
        }
        return "kind : " + kind + ", number : " + number;

    } // toString()의 끝
} // Card클래스의 끝
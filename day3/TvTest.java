class Tv {
    // tv property
    String color;
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest {
    public static void main(String args[]){
        Tv t1 = new Tv();
        Tv t2 = new Tv(); // Tv인스턴스 생성;
        System.out.println("t1의 채널값은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널값은 " + t2.channel + "입니다.");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 채널값은 " + t1.channel + "으로 변경했습니다");
        System.out.println("t1의 채널값은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널값은 " + t2.channel + "입니다.");

    }
}
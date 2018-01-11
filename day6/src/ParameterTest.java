class Data { int x; }
// Method Area에 생성이 된다.

class ParameterTest {
    public static void main(String [] args) {
        Data d = new Data();
        // 인스턴스생성
        d.x = 10;
        System.out.println("main () : x = "+d.x);

        change(d.x);
        System.out.println("After changed(d.x)");
        System.out.println("main () : x = " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("cahnge() : x = "+ x);
    }
}

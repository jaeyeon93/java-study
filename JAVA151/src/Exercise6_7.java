
class Exercise6_7 {
    public static void main(String [] args) {
        //Mypoint p = new Mypoint(1, 1);
        MyPoint p = new MyPoint();
        p.x = 1;
        p.y = 1;
        System.out.println(p.getDistance(4,5));
        // 문제는 객체를 생성하고 인스턴스메소드를 호출하는것이 문제이다.
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(){

    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 인스턴스 메서드는 객체 생성후에 호출이 가능
    // getDistance는 현재 인스턴스 메서드이다.
    double getDistance(int x, int y) {
        int num1 = x - this.x ;
        int num2 = y - this.y;
        double result = Math.pow(num1, 2) + Math.pow(num2, 2);
        return Math.sqrt(result);
        // 여기까지는 맞다.
    }
}
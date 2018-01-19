class Car {
    String color;
    String gearType;
    int door;

    Car () {
        // 매개변수가 없는 생성자
        // default값이다.
        this("white","auto",4);
    }

    Car (Car c) {
        // 인스턴스 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        // this.color는 인스턴스변수이고, color는 전달받은 매개변수이다.
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest3 {
    public static void main(String [] args){
        Car c1 = new Car();
        Car c2 = new Car(c1);
        // c1의 복사본 c2를 생선한다.

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
        c1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
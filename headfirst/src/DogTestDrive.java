public class DogTestDrive {
    public static void main(String [] args){
       Dog d = new Dog();
       d.size = 40;
       d.bark();
    }
}

class Dog {
    int size;
    String breed;
    String name;
    // 위에 값들이 인스턴스 변수이다.

    void bark(){
        System.out.println("Ruff! Ruff");
    }
}

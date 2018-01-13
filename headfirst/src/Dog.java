class Dog {
    String name;
    public static void main(String [] args){
        // Dog 객체를 만들고 접근
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // make dog array
        Dog [] myDogs = new Dog[3];
        // 개 몇 마리 집어넣습니다.
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // 배열 레퍼선스를 써서 Dog객체에 접근
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // myDog[2]의 이름이 뭐였지?
        System.out.println("마지막 개의 이름?");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name +"이 왈!하고 짓습니다.");
    }

    public void eat() { }
    public void chaseCat() {}
}


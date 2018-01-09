public class OperatorEx8 {
    public static void main(String [] args){
        byte a = 10;
        byte b = 20;
        //byte c = a + b;
        byte c = (byte)(a + b);
        System.out.println(c);
        // error 발생.
        // a + b는 int형으로 변환이 되는데
        // byte형으로 선언을 했기때문에 발생

    }

}

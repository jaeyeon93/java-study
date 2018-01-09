public class OperatorEx10 {
    public static void main (String [] args){
        int a = 1000000;
        int b = 2000000;
        long c = a * b;
        System.out.println(c);
        // expected result is 2,000,000,000,000
        // but c is -1454759936
        // why?
        //
    }
}

public class OperatorEx13 {
    public static void main(String [] args) {
        char c1 = 'a'; // ASCII of a is 97
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1; // a1 + 1 => 97 + 1 => 98;

        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
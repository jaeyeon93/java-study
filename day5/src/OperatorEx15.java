public class OperatorEx15 {
    public static void main(String [] args) {
        char c = 'a';
        for(int i = 0; i < 26; i++) {
            System.out.print(c++);
            // print a-z
        }

        System.out.println();
        // change the line

        c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }

        System.out.println();

        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(c++);
            // print 10 string from '0'
        }
        System.out.println();
    }
}

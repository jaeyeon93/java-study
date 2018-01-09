public class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        // method
        int num1 = x1 - x;
        int num2 = y1 - y;
        double result = Math.pow(num1, 2) + Math.pow(num2, 2);
        //System.out.println("middle step is : "+ result);
        return Math.sqrt(result);
    }

    public static void main (String [] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}

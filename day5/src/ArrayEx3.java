public class ArrayEx3 {
    public static void main(String [] args){
        int [] number = new int[10];
        // declare array length of 10
        for (int i = 0; i < number.length; i++){
            number[i] = i;
            System.out.println(number[i]);
        }
        System.out.println();

        for(int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10);
            // 0-9중 임의로 하나를 얻는다.
            int temp = number[0];
            number[0] = number[n];
            number[n] = temp;
            // number[0]와 number[n]을 서로 바꾼다.
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
     }
}

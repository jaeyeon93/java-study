public class bubble_sorting {
    public static void main(String [] args) {
        int [] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < number.length; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지 체크;

            for (int j = 0; j < number.length-1-i; j++) {
                if(number[j] > number[j+1]) { // 옆의 값이 크면 바꾼다.
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    changed = true;
                } // end if
            } // end for j
            if (!changed) break; // 자리바꿈이 없으면 반복문을 벗어난다.
        }

        for (int k = 0; k < number.length; k++){
            System.out.print(number[k]);
        }
        System.out.println();
    }
}

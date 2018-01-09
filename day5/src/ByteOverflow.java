public class ByteOverflow {
    public static void main (String [] args){
        byte b = 0;
        int i = 0;

        // 반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
        for (int x = 0; x <= 270; x++) {
            System.out.println(b++);
            System.out.println('\t');
            System.out.println(i++);

        }
    }
}

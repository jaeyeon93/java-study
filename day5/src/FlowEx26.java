public class FlowEx26 {
    public static void main (String [] args){
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;
            // 조건식이 true가 되면 continue문이 수행되면 반복문의 끝으로 이동한다.
            System.out.println(i);
        }
    }
}

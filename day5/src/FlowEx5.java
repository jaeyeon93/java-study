public class FlowEx5 {
    public static void main(String [] args){
        int score = 82;
        String grade = "";
        /*
        grade는 참조변수이므로 null로 초기화 할 수 있다. 그러나 String은 일반적으로 빈문자열 ""로 초기화를 한다.
        char grade = ' '; 이렇게 초기화!!!
        char grade = ''; 에러 !!
         */
        System.out.println("당신의 점수는 " + score + "입니다.");
        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                grade += "+";
            } else if (score < 94) {
                grade += "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                grade += "+";
            } else if (score < 84) {
                grade += "-";
            }
        } else {
            grade = "C";
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}

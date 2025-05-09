package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;


        int score = 93;

        if( score >= 90 ) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } // else 가 없는 if 문은 실행이 될 수도 있고 안 될 수도 있다
// if 와 if 이기 때문에 서로 별개임. 서로 영향을 끼치지 않음
        if (score < 90 ) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}

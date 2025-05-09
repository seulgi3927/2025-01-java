package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;


        int score = 93;

        if( score >= 90 ) { // 얘는 하나의 if 문으로 하나의 결과만 나타낸다
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else { // if가 true 가 아니였을 경우 나머지 수를 나타낸다 else 는 무조건 하나는 나타낸다
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}

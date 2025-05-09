package ch02.sec01;

public class VariableExchangeExample {
    // 메인 메소드 작성
    public static void main(String [] args) {
        int x = 3, y = 5;
        System.out.println("x: " + x + ", y: " + y); // x: 3, y: 5

        int temp;
        temp = x; // 빈 공간에다 x의 값을 저장해둠
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y: " + y); // x: 5, y: 3
    }
}

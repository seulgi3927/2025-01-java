package ch04;

public class RandomNumber {
    public static void main(String[] args) {
        // API, Math.random() double 타입 리턴,0.0000000 ~ 0.9999999, 절대 1이 안 나온다.
        // 실수타입인 더블타입을(?) 랜덤하게 얻을 수 있다

        System.out.println( Math.random() );

        double value = 0.99999;
        double result = value * 10; // 9.9999
        System.out.println("result: " + result);

        int intResult = (int)result; // 강제 형변환, 명시적 형변환 > 9.9999 > 9 변환
        System.out.println("intResult: " + intResult);

        double value2 = 0.00002;
        System.out.println("value2: " + (int)(value2 * 10.0)); // 0

       System.out.println((int) (Math.random() * 10.0) ); // 0 ~ 9

    }
}
